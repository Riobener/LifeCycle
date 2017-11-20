package com.example.student1.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = this.getIntent();
        int num = intent.getIntExtra("num",0);


        TextView textView = (TextView)findViewById(R.id.result);

        textView.setText((num*num)+"");
    }
}