package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.util.logging.Logger.global;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        Button subButton = (Button) findViewById(R.id.subButton);
        Button multButton = (Button) findViewById(R.id.multButton);

        final TextView result = (TextView) findViewById(R.id.numAnswer);

        EditText numArg1 = (EditText) findViewById(R.id.numArg1);
        EditText numArg2 = (EditText) findViewById(R.id.numArg2);

        final Editable arg1_editable = numArg1.getText();
        final Editable arg2_editable = numArg2.getText();

        String arg1_string = "0";
        String arg2_string = "0";

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //result.setText("you want to add");
                String arg1_string = arg1_editable.toString();
                String arg2_string = arg2_editable.toString();
                if(!TextUtils.isEmpty(arg1_string) && !TextUtils.isEmpty(arg2_string)) {
                    double arg1 = Double.valueOf(arg1_string);
                    double arg2 = Double.valueOf(arg2_string);
                    double sum = arg1 + arg2;
                    result.setText(String.valueOf(sum));
                }
                else{
                    result.setText("PUT IN NUMBERS PLEASE");
                }

            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //result.setText("you want to subtract");
                String arg1_string = arg1_editable.toString();
                String arg2_string = arg2_editable.toString();
                if(!TextUtils.isEmpty(arg1_string) && !TextUtils.isEmpty(arg2_string)) {
                    double arg1 = Double.valueOf(arg1_string);
                    double arg2 = Double.valueOf(arg2_string);
                    double diff = arg1 - arg2;
                    result.setText(String.valueOf(diff));
                }
                else{
                    result.setText("PUT IN NUMBERS PLEASE");
                }
            }
        });

        multButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //result.setText("you want to multiply");
                String arg1_string = arg1_editable.toString();
                String arg2_string = arg2_editable.toString();
                if(!TextUtils.isEmpty(arg1_string) && !TextUtils.isEmpty(arg2_string)) {
                    double arg1 = Double.valueOf(arg1_string);
                    double arg2 = Double.valueOf(arg2_string);
                    double prod = arg1 * arg2;
                    result.setText(String.valueOf(prod));
                }
                else{
                    result.setText("PUT IN NUMBERS PLEASE");
                }
            }
        });

    }
}
