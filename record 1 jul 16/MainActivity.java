package com.example.p1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;

    // Sample correct credentials
    final String correctUsername = "admin";
    final String correctPassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.buttonLogin);




        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = usernameEditText.getText().toString().trim();
                String inputPassword = passwordEditText.getText().toString().trim();

                if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    // TODO: navigate to another activity if needed
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed. Try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
