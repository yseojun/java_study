package com.example.caller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Caller extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caller);

        EditText editText1, editText2;
        Button button_send;
        button_send = findViewById(R.id.button_send);
        editText1 = findViewById(R.id.edit_text_1);
        editText2 = findViewById(R.id.edit_text_2);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Callee.class);

                String num1Str = editText1.getText().toString();
                String num2Str = editText2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    intent.putExtra("num1", Double.parseDouble(num1Str));
                    intent.putExtra("num2", Double.parseDouble(num2Str));

                    startActivityForResult(intent, 0);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Not a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            double sum = data.getDoubleExtra("RESULT_SUM", 0);

            Toast.makeText(getApplicationContext(), "Sum: " + sum, Toast.LENGTH_SHORT).show();
        }
    }

}