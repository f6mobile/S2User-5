package com.sadkovoi.myapplicationkucherov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_device);
    }
    public void termostar(View view){
        String packageContext;
        Intent intent = new Intent(packageContext: this, Lightreg .class);
        startActivity(intent);
    }
    }