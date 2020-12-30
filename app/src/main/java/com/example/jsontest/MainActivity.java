package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;

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
        jclass.AddObjToJArray("Categories", "categories", "cat1");
        jclass.AddObjToJArray("Categories", "categories", "cat2");
        tv.setText(jclass.ReadJObjectFromJson());
    }
}