package com.hxlxz.hxl.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean FirstNumOK = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButton1Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("1"));
        else
            editText2.setText(editText2.getText().append("1"));
    }

    public void OnButton2Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("2"));
        else
            editText2.setText(editText2.getText().append("2"));
    }

    public void OnButton3Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("3"));
        else
            editText2.setText(editText2.getText().append("3"));
    }

    public void OnButton4Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("4"));
        else
            editText2.setText(editText2.getText().append("4"));
    }

    public void OnButton5Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("5"));
        else
            editText2.setText(editText2.getText().append("5"));
    }

    public void OnButton6Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("6"));
        else
            editText2.setText(editText2.getText().append("6"));
    }

    public void OnButton7Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("7"));
        else
            editText2.setText(editText2.getText().append("7"));
    }

    public void OnButton8Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("8"));
        else
            editText2.setText(editText2.getText().append("8"));
    }

    public void OnButton9Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("9"));
        else
            editText2.setText(editText2.getText().append("9"));
    }

    public void OnButton0Press(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        if (!FirstNumOK)
            editText1.setText(editText1.getText().append("0"));
        else
            editText2.setText(editText2.getText().append("0"));
    }

    public void OnButtonPlusPress(View view) {
        TextView textView = (TextView) findViewById((R.id.textView));
        textView.setText("+");
        FirstNumOK = true;
    }

    public void OnButtonMinusPress(View view) {
        TextView textView = (TextView) findViewById((R.id.textView));
        textView.setText("-");
        FirstNumOK = true;
    }

    public void OnButtonChenPress(View view) {
        TextView textView = (TextView) findViewById((R.id.textView));
        textView.setText("*");
        FirstNumOK = true;
    }

    public void OnButtonDividePress(View view) {
        TextView textView = (TextView) findViewById((R.id.textView));
        textView.setText("/");
        FirstNumOK = true;
    }

    public void OnButtonEnterPress(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById((R.id.textView));
        TextView textView2 = (TextView) findViewById((R.id.textView2));
        double a = Double.parseDouble(editText1.getText().toString());
        double b = Double.parseDouble(editText2.getText().toString());
        double c = 0;
        switch (textView.getText().toString().toCharArray()[0]) {
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
        textView2.setText("=" + String.valueOf(c));
        FirstNumOK = false;
    }

    public void OnButtonCPress(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById((R.id.textView));
        TextView textView2 = (TextView) findViewById((R.id.textView2));
        editText1.setText("");
        editText2.setText("");
        textView.setText("");
        textView2.setText("");
        FirstNumOK = false;
    }
}
