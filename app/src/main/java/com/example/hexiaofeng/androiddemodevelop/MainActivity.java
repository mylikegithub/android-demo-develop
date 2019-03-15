package com.example.hexiaofeng.androiddemodevelop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "11", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "22", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "33", Toast.LENGTH_SHORT).show();
    }
}
