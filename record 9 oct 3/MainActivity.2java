package com.example.record9;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvDetails = findViewById(R.id.tvDetails);

        // Get data back from SharedPreferences
        SharedPreferences sp = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String name = sp.getString("name", "No Name");
        String email = sp.getString("email", "No Email");

        tvDetails.setText("Name: " + name + "\nEmail: " + email);
    }
}

