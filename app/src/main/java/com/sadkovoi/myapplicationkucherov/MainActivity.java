package com.sadkovoi.myapplicationkucherov;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.sadkovoi.myapplicationkucherov.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}