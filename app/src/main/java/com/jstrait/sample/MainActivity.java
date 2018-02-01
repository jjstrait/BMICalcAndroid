package com.jstrait.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    protected EditText in_num1;
    protected EditText in_num2;
    protected Button in_btn;
    protected TextView out_results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in_btn = (Button) findViewById(R.id.button);
        in_btn.setOnClickListener(this);
        in_num1 = (EditText) findViewById(R.id.in_num1);
        in_num2 = (EditText) findViewById(R.id.in_num2);
        out_results = (TextView) findViewById(R.id.out_sum);
        //out_results.setText();
    }

    @Override
    public void onClick(View view) {
        String height = in_num1.getText().toString();
        String weight = in_num2.getText().toString();


        double answer = (Double.parseDouble(weight) / Math.pow( Double.parseDouble(height),2) * 703);
        String results = ""+answer;
        out_results.setText(results);
    }
}
