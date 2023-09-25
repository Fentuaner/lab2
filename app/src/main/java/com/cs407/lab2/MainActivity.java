package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;

    public void add(View view) {
        double firstNumber = Double.parseDouble(text1.getText().toString());
        double secondNumber = Double.parseDouble(text2.getText().toString());
        double answer = firstNumber + secondNumber;
        if (Double.isInfinite(answer)) {
            Toast.makeText(this, "Error: Result is not countable.", Toast.LENGTH_SHORT).show();
        }
            goToActivity("" + answer);
    }

    public void subtract(View view) {
        double firstNumber = Double.parseDouble(text1.getText().toString());
        double secondNumber = Double.parseDouble(text2.getText().toString());
        double answer = firstNumber - secondNumber;
        if (Double.isInfinite(answer)) {
            Toast.makeText(this, "Error: Result is not countable.", Toast.LENGTH_SHORT).show();
        }
            goToActivity("" + answer);
    }

    public void multiply(View view) {
        double firstNumber = Double.parseDouble(text1.getText().toString());
        double secondNumber = Double.parseDouble(text2.getText().toString());
        double answer = firstNumber * secondNumber;
        if (Double.isInfinite(answer)) {
            Toast.makeText(this, "Error: Result is not countable.", Toast.LENGTH_SHORT).show();
        }
            goToActivity("" + answer);

    }
 /*   EditText editText1 = (EditText) findViewById(R.id.editTextText);
        editText1.setFilters(new InputFilter[]{filter});
    EditText editText2 = (EditText) findViewById(R.id.editTextText2);
        editText2.setFilters(new InputFilter[]{filter});
    String text1 = editText1.getText().toString();
    Integer num1 = Integer.parseInt(text1);
    String text2 = editText2.getText().toString();
    Integer num2 = Integer.parseInt(text2);
    Integer result = num1 + num2 ;
    goToActivity(result);
}*/
    public void divide(View view) {
        double firstNumber = Double.parseDouble(text1.getText().toString());
        double secondNumber = Double.parseDouble(text2.getText().toString());
        double answer = firstNumber / secondNumber;
        if (Double.isInfinite(answer)) {
            Toast.makeText(this, "Error: Result is not countable.", Toast.LENGTH_SHORT).show();
        }
            goToActivity("" + answer);
    }

    public void goToActivity(String str) {
        Log.i("Info", str);
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("result", str);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle resulrGetting) {
        super.onCreate(resulrGetting);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.firstNum);
        text2 = findViewById(R.id.secondNum);
    }
}