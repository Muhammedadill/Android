package com.example.record8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
       b.setOnClickListener(
               v -> {
            Intent p = new Intent(this, MainActivity2.class);
            p.putExtra("name", "Virat");
            p.putExtra("name1", "Kohli");
            startActivity(p);
        }
       );

    }


}
