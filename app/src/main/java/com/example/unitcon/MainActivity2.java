package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.PrintStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    public static final String b="Purusharth";
    EditText editText1;
    TextView output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1=findViewById(R.id.tempreture);
        output1=findViewById(R.id.tempans);
    }

    Intent intent = getIntent();
    public void next(View v){
        Intent intent=new Intent(this,MainActivity3.class);
        intent.putExtra(b,0);
        startActivity(intent);
    }
    public void ctok(View v){
        String a = editText1.getText().toString();
        double b = Double.parseDouble(a);
        double g =b+274.15;
        output1.setText("Value=" + g);
    }
    public void ktoc(View v){
        String a = editText1.getText().toString();
        double b = Double.parseDouble(a);
        double g =b-274.15;
        output1.setText(String.format("Value=\"%.3f\"",g));
    }
    public void ftoc(View v){
        String a = editText1.getText().toString();
        double b = Double.parseDouble(a);
        double g = (b - 32) / 1.8;
        output1.setText(String.format("Value=\"%.3f\"",g ));
    }
    public void ctof(View v){
        String a = editText1.getText().toString();
        double b = Double.parseDouble(a);
        double g = (b* 9/5 ) + 32;
        output1.setText("Value=" + g);
    }

}
