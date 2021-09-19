package com.example.mycalculator;

import static com.example.mycalculator.R.*;
import static com.example.mycalculator.R.drawable.wooden_button_resize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultFieldTextView;
    private TextView equalsTextView;
    private Button additionButton;
    private Button subtractionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.first_number_edit_text);
        secondNumberEditText = findViewById(R.id.second_number_edit_text);
        resultFieldTextView = findViewById(R.id.result_field_text_view);
        additionButton = findViewById(R.id.addition_button);

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                int result;
                result = firstNumber + secondNumber;
                resultFieldTextView.setText(result);
            }
        });

    }

}