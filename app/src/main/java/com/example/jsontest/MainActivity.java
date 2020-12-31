package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.JsonElement;

public class MainActivity extends AppCompatActivity {
    JsonClass jclass;
    TextView tv;
    Button btn;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv1);
        btn = (Button)findViewById(R.id.btn1);
        counter = 0;
        jclass = new JsonClass(this);
        jclass.InitializeJFile("Categories");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jclass.AddObjToJArray("Categories", "category", "cat" + jclass.GetArraySize("Categories"));
                tv.setText(jclass.GetValueFromJArray("Categories", jclass.GetArraySize("Categories")-1));
            }
        });

    }
}