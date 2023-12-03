package com.example.mp_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SEOULTECH";
    private static final String MYINFO = "Student #: 17100138, Name: Seojun Yang";
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "+++ ON CREATE +++");
        TextView textview = new TextView(this);
        textview.setText(MYINFO);
        setContentView(textview);
    }
    @Override protected void onStart() {
        super.onStart(); Log.v(TAG, "++ ON START ++");
    }
    @Override protected void onResume() {
        super.onResume(); Log.v(TAG, "+ ON RESUME +");
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
