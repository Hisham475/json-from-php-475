package com.example.json_from_php;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {
    Button bttn_sqlConn,btnView;
    TextView textview;

    phpConn phpC = new phpConn();
    final String fetch = "http://192.168.1.143/sqli/fetch2json.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnView = (Button) findViewById(R.id.btnView);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ViewListContents.class);
                startActivity(intent);
            }
        });

        textview=(TextView)findViewById(R.id.textView);
        bttn_sqlConn= (Button)findViewById(R.id.bttnSQLCon);
        bttn_sqlConn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    phpC.urlCon(fetch);
                    //getting an array back
                    JSONArray js_array = new JSONArray(phpC.getAnswer());
                    textview.setText(js_array.toString());

                    /* reading the JSON array line by line */
                    for (int i = 0; i < js_array.length(); i++) {
                        String value = js_array.getString(i);
                        Log.v("george json", i+"="+value);
                    }
                } catch (Exception e) {
                    Log.e("Error", e.toString());
                }

            }
        });


    }
}
