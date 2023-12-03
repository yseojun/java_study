package com.example.mp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    CheckBox checkBox1; TextView textView2;
    RadioGroup radioGroup1; Button button1; ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_viewer);

        checkBox1 = (CheckBox) findViewById(R.id.check_box_1);
        textView2 = (TextView) findViewById(R.id.text_view_2);
        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group_1);
        button1 = (Button) findViewById(R.id.button_1);
        imageView1 = (ImageView) findViewById(R.id.image_view_1);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox1.isChecked() == true) {
                    textView2.setVisibility(View.VISIBLE);
                    radioGroup1.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.VISIBLE);
                    imageView1.setVisibility(View.VISIBLE);
                }
                else {
                    textView2.setVisibility(View.INVISIBLE);
                    radioGroup1.setVisibility(View.INVISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    imageView1.setVisibility(View.INVISIBLE);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View arg0){
              //R.id 가 constant
                int checkedButton = radioGroup1.getCheckedRadioButtonId();

                if (checkedButton == R.id.radio_button_1){
                    Toast.makeText(getApplicationContext(), "Image 1 is selected", Toast.LENGTH_SHORT).show();
                    imageView1.setImageResource(R.drawable.image1);
                }
                else if (checkedButton == R.id.radio_button_2){
                    Toast.makeText(getApplicationContext(), "Image 2 is selected", Toast.LENGTH_SHORT).show();
                    imageView1.setImageResource(R.drawable.image2);
                }
                else if (checkedButton == R.id.radio_button_3){
                    Toast.makeText(getApplicationContext(), "Image 3 is selected", Toast.LENGTH_SHORT).show();
                    imageView1.setImageResource(R.drawable.image3);
                }
                else if (checkedButton == R.id.radio_button_4){
                    Toast.makeText(getApplicationContext(), "Image 4 is selected", Toast.LENGTH_SHORT).show();
                    imageView1.setImageResource(R.drawable.image4);
                }
                else if (checkedButton == R.id.radio_button_5){
                    Toast.makeText(getApplicationContext(), "Image 5 is selected", Toast.LENGTH_SHORT).show();
                    imageView1.setImageResource(R.drawable.image5);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Error: No images selected.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}