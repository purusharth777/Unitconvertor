package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {
    EditText editText;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        editText=findViewById(R.id.input);
        output=findViewById(R.id.output);
    }
    public void kgtog(View v) {
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = 1000 * b;
        output.setText("Value=" + g);

    }
    public void gajtom(View v) {
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b*0.8281;
        output.setText(String.format("Value=\"%.3f\"",g));

    }

    public void gtokg(View v) {
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b / 1000;
        output.setText("Value=" + g);


    }
    public void kgtoton(View v) {
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b* 0.00110231;
        output.setText("Value=" + g);


    }
    public void tontokg(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b* 907.185;
        output.setText("Value=" + g);
    }
    public void gtomili(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b* 1000;
        output.setText("Value=" + g);
    }
    public void gtomicro(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b* 1000000;
        String c=Double.toString(g);
        output.setText("Value=" + g);
    }
    public void microtog(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b/1000000;
        output.setText("Value=" + g);
    }
    public void millitog(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b*1000;
        output.setText("Value=" + g);
    }
    public void gtonano(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b*1000000000;
        output.setText("Value=" + g);
    }
    public void nanotog(View v){
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = b/1000000000;
        output.setText("Value=" + g);
    }
    public void gtopico(View v){
        String a = editText.getText().toString();
        String b = 	"1000000000000";
        String c=b.substring(1,b.length());
        String g=a+c;
        output.setText("Value=" + g);
    }





}

