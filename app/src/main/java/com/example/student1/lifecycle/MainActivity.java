package com.example.student1.lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText EdTxt;
    public void secondActivity(View view) {
        //Intent intent = new Intent(this, Main2Activity.class);
       //String text = ((Button) view).getText().toString();
        //intent.putExtra("num", Integer.parseInt(text));
        //startActivity(intent);
        EdTxt = (EditText)findViewById(R.id.textView);
        String txt =  EdTxt.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://"+txt));
        startActivity(intent);

    }
}