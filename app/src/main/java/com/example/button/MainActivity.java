package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {
        Toast.makeText(this, getString(R.string.massage_knopka1) + String.valueOf(++counter), Toast.LENGTH_SHORT).show();
    }

    public void TwoClick(View view) {
        Toast.makeText(this, getString(R.string.massage_knopka2) + String.valueOf(--counter), Toast.LENGTH_SHORT).show();
    }
}