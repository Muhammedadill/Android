package com.example.record9;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvName, tvEmail, tvPassword;
    private SharedPreferences sharedPreferences;
    public static final String MyPREFERENCES = "MyPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        // Retrieve saved data
        String name = sharedPreferences.getString("Name", "No Name");
        String email = sharedPreferences.getString("Email", "No Email");
        String passwordHash = sharedPreferences.getString("PasswordHash", "No Password");

        // Display data
        tvName.setText("Name: " + name);
        tvEmail.setText("Email: " + email);
        tvPassword.setText("Password (SHA-256): " + passwordHash);
    }
}

