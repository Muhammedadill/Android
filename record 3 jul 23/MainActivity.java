package com.example.p3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button addBtn, subBtn, mulBtn, divBtn;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this matches your XML filename

        // Initialize views
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        addBtn = findViewById(R.id.button);
        subBtn = findViewById(R.id.button2);
        mulBtn = findViewById(R.id.button3);
        divBtn = findViewById(R.id.button4);
        resultText = findViewById(R.id.textView3);

        // Set listeners
        addBtn.setOnClickListener(v -> calculate('+'));
        subBtn.setOnClickListener(v -> calculate('-'));
        mulBtn.setOnClickListener(v -> calculate('*'));
        divBtn.setOnClickListener(v -> calculate('/'));
    }

    private void calculate(char operator) {
        String input1 = editText1.getText().toString().trim();
        String input2 = editText2.getText().toString().trim();

        if (input1.isEmpty() || input2.isEmpty()) {
            resultText.setText("Please enter both numbers.");
            return;
        }

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            double result = 0;

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 == 0) {
                        resultText.setText("Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    resultText.setText("Unknown operator");
                    return;
            }

            resultText.setText("Result: " + result);

        } catch (NumberFormatException e) {
            resultText.setText("Invalid number input.");
        }
    }
}
