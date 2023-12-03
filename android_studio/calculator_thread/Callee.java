package com.example.caller;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Callee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callee);
        
        Button button_add, button_sub, button_div, button_mul;
        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_div = findViewById(R.id.button_div);

        Intent inIntent = getIntent();
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(), Callee.class);

                double sum = inIntent.getDoubleExtra("num1", 0) + inIntent.getDoubleExtra("num2", 0);
                outIntent.putExtra("RESULT_SUM", sum);

                setResult(RESULT_OK, outIntent);
                finish();
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(), Callee.class);

                double sum = inIntent.getDoubleExtra("num1", 0) - inIntent.getDoubleExtra("num2", 0);
                outIntent.putExtra("RESULT_SUM", sum);

                setResult(RESULT_OK, outIntent);
                finish();
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(), Callee.class);

                double sum = inIntent.getDoubleExtra("num1", 0) * inIntent.getDoubleExtra("num2", 0);
                outIntent.putExtra("RESULT_SUM", sum);

                setResult(RESULT_OK, outIntent);
                finish();
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(), Callee.class);

                double sum = inIntent.getDoubleExtra("num1", 0) / inIntent.getDoubleExtra("num2", 0);
                outIntent.putExtra("RESULT_SUM", sum);

                setResult(RESULT_OK, outIntent);
                finish();
            }
        });
    }
}