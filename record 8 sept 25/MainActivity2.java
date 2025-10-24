package com.example.record8;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text1 = extra.getString("name1");

        t1.setText(text);
        t2.setText(text1);
    }
}
