package com.example.mp_2;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    TextView textResult;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    private static final String TAG = "Seojun";
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "+++ ON CREATE +++");
        setContentView(R.layout.calculator);
        initButton();
    }

    private void initButton(){
        editText1 = (EditText) findViewById(R.id.edit_text_1);
        editText2 = (EditText) findViewById(R.id.edit_text_2);
        buttonAdd = (Button) findViewById(R.id.button_add);
        buttonSub = (Button) findViewById(R.id.button_sub);
        buttonDiv = (Button) findViewById(R.id.button_div);
        buttonMul = (Button) findViewById(R.id.button_mul);
        textResult = (TextView) findViewById((R.id.text_view_1));
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) + Double.parseDouble(number2);
                textResult.setText("Result: " + result.toString());
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) - Double.parseDouble(number2);
                textResult.setText("Result: " + result.toString());
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) * Double.parseDouble(number2);
                textResult.setText("Result: " + result.toString());
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String number1 = editText1.getText().toString();
                String number2 = editText2.getText().toString();
                Double result = Double.parseDouble(number1) / Double.parseDouble(number2);
                textResult.setText("Result: " + result.toString());
            }
        });
    }

    @Override protected void onStart() {
        super.onStart(); Log.v(TAG, "++ ON START ++");
    }
    @Override protected void onPostResume() {
        super.onPostResume(); Log.v(TAG, "+ ON RESUME +");
    }
    @Override protected void onPause() {
        super.onPause(); Log.v(TAG, "- ON PAUSE -");
    }
    @Override protected void onStop() {
        super.onStop(); Log.v(TAG, "--- ON STOP ---");
    }
    @Override protected void onDestroy() {
        super.onDestroy(); Log.v(TAG, "--- ON DESTROY ---");
    }
}