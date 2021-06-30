package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView output;

    public static final String a = "com.example.unitcon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.input);
        output = findViewById(R.id.output);


    }

    public void next(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(a, 0);
        startActivity(intent);

    }
    public void length(View v){
        Intent intent = new Intent(this, Length.class);
        intent.putExtra(a, 0);
        startActivity(intent);
    }
    public void volume(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra(a, 0);
        startActivity(intent);

    }


    public void kgtog(View v) {
        String a = editText.getText().toString();
        double b = Double.parseDouble(a);
        double g = 1000 * b;
        output.setText("Value=" + g);

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
