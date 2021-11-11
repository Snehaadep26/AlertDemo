package com.example.interactivitydemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public void clickfunction(View view)
    {
        EditText nameEditText=(EditText)findViewById(R.id.nameEditText);
        Log.i("info","It Worked" );
        Log.i("values",nameEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}