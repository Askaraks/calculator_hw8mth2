package com.geektech.geektech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class equalActivity extends AppCompatActivity {
    private TextView equalText;
    private Button equalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equal);
        equalText = findViewById(R.id.equalText);
        equalButton = findViewById(R.id.equalButton);


        String text = getIntent().getStringExtra("key1");
        equalText.setText(text);

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}