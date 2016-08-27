package com.hxlxz.hxl.calculator;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean FirstNumOK = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButtonPress_Num(View view) {
        TextView textView1 = (TextView) findViewById((R.id.textView1));
        TextView textView3 = (TextView) findViewById((R.id.textView3));
        if (!FirstNumOK)
            textView1.setText(textView1.getText().toString() + ((Button)(findViewById(view.getId()))).getText());
        else
            textView3.setText(textView3.getText().toString() + ((Button)(findViewById(view.getId()))).getText());
    }

    public void OnButtonPress_Operator(View view) {
        TextView textView2 = (TextView) findViewById((R.id.textView2));
        textView2.setText(((Button)(findViewById(view.getId()))).getText());
        FirstNumOK = true;
    }

    public void OnButtonEnterPress(View view) {
        TextView textView1 = (TextView) findViewById((R.id.textView1));
        TextView textView2 = (TextView) findViewById((R.id.textView2));
        TextView textView3 = (TextView) findViewById((R.id.textView3));
        TextView textView4 = (TextView) findViewById((R.id.textView4));
        try {
            double a = Double.parseDouble(textView1.getText().toString());
            double b = Double.parseDouble(textView3.getText().toString());
            double c = 0;
            switch (textView2.getText().toString().toCharArray()[0]) {
                case '+':
                    c = a + b;
                    break;
                case '-':
                    c = a - b;
                    break;
                case '*':
                    c = a * b;
                    break;
                case '/':
                    c = a / b;
                    break;
                default:
                    break;
            }
            textView4.setText("=" + String.valueOf(c));
        }
        catch(Exception e) {

        }

        FirstNumOK = false;
    }

    public void OnButtonCPress(View view) {
        TextView textView1 = (TextView) findViewById((R.id.textView1));
        TextView textView2 = (TextView) findViewById((R.id.textView2));
        TextView textView3 = (TextView) findViewById((R.id.textView3));
        TextView textView4 = (TextView) findViewById((R.id.textView4));
        textView1.setText("");
        textView2.setText("");
        textView3.setText("");
        textView4.setText("");
        FirstNumOK = false;
    }
}
