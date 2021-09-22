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
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.Locale;
import java.util.Objects;
import java.util.SplittableRandom;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultFieldTextView;
    private MaterialButton exitButton;
    private MaterialButton resetButton;
    private Button additionButton;
    private Button subtractionButton;
    private Button divisionButton;
    private Button multiplicationButton;
    Calculator calcResult = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.first_number_edit_text);
        secondNumberEditText = findViewById(R.id.second_number_edit_text);
        resultFieldTextView = findViewById(R.id.result_field_text_view);
        additionButton = findViewById(R.id.addition_button);
        subtractionButton = findViewById(id.subtraction_button);
        divisionButton = findViewById(id.division_button);
        multiplicationButton = findViewById(id.multiplication_button);
        exitButton = findViewById(id.exit_button);
        resetButton = findViewById(id.reset_button);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumberEditText.getText().clear();
                secondNumberEditText.getText().clear();
                resultFieldTextView.setText("");
            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstArg = firstNumberEditText.getText().toString();
                String secondArg = secondNumberEditText.getText().toString();
                if (firstArg == null || secondArg == null) {
                    Toast.makeText(MainActivity.this, "Enter number!", Toast.LENGTH_SHORT).show();
                } else {
                    resultFieldTextView.setText(calcResult.addition(firstArg, secondArg));
                }
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstArg = firstNumberEditText.getText().toString();
                String secondArg = secondNumberEditText.getText().toString();
                if (firstArg == null || secondArg == null) {
                    Toast.makeText(MainActivity.this, "Enter number!", Toast.LENGTH_SHORT).show();
                } else {
                    resultFieldTextView.setText(calcResult.subtraction(firstArg, secondArg));
                }
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO
            }
        });

//        divisionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                float firstNumber = Float.parseFloat(firstNumberEditText.getText().toString());
//                float secondNumber = Float.parseFloat(secondNumberEditText.getText().toString());
//                if (secondNumber == 0){
//                    Toast.makeText(MainActivity.this,"You can't divide on o!",Toast.LENGTH_SHORT).show();
//                } else {
//                    float result;
//                    result = firstNumber/secondNumber;
//                    resultFieldTextView.setText(String.format(Locale.getDefault(),"%.2f",result));
//                }
//            }
//        });

    }
}