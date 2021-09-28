package com.example.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class OptionsActivity extends AppCompatActivity {

    private MaterialButton returnMaterialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        returnMaterialButton = findViewById(R.id.return_button);

        returnMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent optionActivityIntent = new Intent(OptionsActivity.this, MainActivity.class);
                startActivity(optionActivityIntent);
            }
        });
    }
}
