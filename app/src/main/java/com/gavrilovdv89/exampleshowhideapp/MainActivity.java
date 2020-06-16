package com.gavrilovdv89.exampleshowhideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showHideText;

    public void show(View view) {
        showHideText.setVisibility(View.VISIBLE);
    }
    public void hide(View view) {
        showHideText.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showHideText = findViewById(R.id.showHideText);
    }
}
