package com.example.domashka1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textResult;
    private EditText numberA;
    private EditText numberB;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.text_result);
        numberA = findViewById(R.id.edit_text_a);
        numberB = findViewById(R.id.edit_text_b);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivision = findViewById(R.id.btn_division);
        DecimalFormat decimalFormat = new DecimalFormat("#.######");

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = numberA.getText().toString();
                String b = numberB.getText().toString();
                if(a.isEmpty() || b.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Введи оба числа", Toast.LENGTH_LONG).show();
                } else {
                    Double a1 = Double.parseDouble(a);
                    Double b1 = Double.parseDouble(b);
                    textResult.setText("A + B = " + decimalFormat.format(a1+b1));
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = numberA.getText().toString();
                String b = numberB.getText().toString();
                if(a.isEmpty() || b.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Введи оба числа", Toast.LENGTH_LONG).show();
                } else {
                    Double a1 = Double.parseDouble(a);
                    Double b1 = Double.parseDouble(b);
                    textResult.setText("A - B = " + decimalFormat.format(a1-b1));
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = numberA.getText().toString();
                String b = numberB.getText().toString();
                if(a.isEmpty() || b.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Введи оба числа", Toast.LENGTH_LONG).show();
                } else {
                    Double a1 = Double.parseDouble(a);
                    Double b1 = Double.parseDouble(b);
                    textResult.setText("A * B = " + decimalFormat.format(a1*b1));
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = numberA.getText().toString();
                String b = numberB.getText().toString();
                if(a.isEmpty() || b.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Введи оба числа", Toast.LENGTH_LONG).show();
                } else {
                    double a1 = Double.parseDouble(a);
                    double b1 = Double.parseDouble(b);
                    if(b1 < 1e-9){
                        Toast.makeText(getApplicationContext(), "На 0 делить нельзя!", Toast.LENGTH_LONG).show();
                    }
                    textResult.setText("A / B = " + decimalFormat.format(1.0*a1/b1));
                }
            }
        });


    }
}