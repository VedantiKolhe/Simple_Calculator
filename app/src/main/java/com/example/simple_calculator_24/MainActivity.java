package com.example.simple_calculator_24;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
      EditText etdfirstvalue , etdsecondvalue;
      Button btnadd,btnsubs,btnmultiply,btndivide;
      Double num1 ,num2;
      TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        initListeners();

    }
    private void initviews(){
        etdfirstvalue = findViewById(R.id.etdfirstvalue);
        etdsecondvalue = findViewById(R.id.etdsecondvalue);
        btnadd = findViewById(R.id.btnadd);
        btnsubs = findViewById(R.id.btnsubs);
        btnmultiply = findViewById(R.id.btnmultiply);
        btndivide = findViewById(R.id.btndivide);
        txtresult = findViewById(R.id.txtresult);
    }
    private void initListeners(){
    btnadd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         num1 = Double.parseDouble(etdfirstvalue.getText().toString());
         num2 = Double.parseDouble(etdsecondvalue.getText().toString());
         Double result = num1 + num2;
         txtresult.setText(String.valueOf(result));
        }
    });
    btnsubs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num1 = Double.parseDouble(etdfirstvalue.getText().toString());
            num2 = Double.parseDouble(etdsecondvalue.getText().toString());
            Double result = num1-num2;
            txtresult.setText(String.valueOf(result));
        }
    });
    btnmultiply.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num1 = Double.parseDouble(etdfirstvalue.getText().toString());
            num2 = Double.parseDouble(etdsecondvalue.getText().toString());
            Double result = num1*num2;
            txtresult.setText(String.valueOf(result));
        }
    });
    btndivide.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num1 = Double.parseDouble(etdfirstvalue.getText().toString());
            num2 = Double.parseDouble(etdsecondvalue.getText().toString());
            Double result = num1/num2;
            txtresult.setText(String.valueOf(result));

        }
    });

    }
}