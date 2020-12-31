package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.JsonElement;

public class MainActivity extends AppCompatActivity {
    JsonClass jclass;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv1);
        jclass = new JsonClass(this);
        jclass.InitializeJFile("Categories");
        jclass.AddObjToJArray("Categories", "category", "cat1");
        jclass.AddObjToJArray("Categories", "category", "cat21");
        tv.setText(jclass.ReadJObjectFromJson().toString());
    }
}