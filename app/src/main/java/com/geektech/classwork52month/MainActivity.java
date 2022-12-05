package com.geektech.classwork52month;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;
import android.system.StructTimespec;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.geektech.classwork52month.R;

public class MainActivity extends AppCompatActivity {
    private Button equal;
    private TextView text;
    private Button secondActivity;
    private Integer first,second;
    private Boolean isOperationClick = false;
    private String operation = "";
    private Integer result;
    private String operationSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.edit_text);
        secondActivity = findViewById(R.id.secondActivity);




        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, equalActivity.class);
                String text = result.toString();
                Intent.putExtra("key1", text);
                startActivity(Intent);
                finish();
            }
        });
    }

    public void onNumberClick(View view) {
        secondActivity.setAlpha(0);
        switch (view.getId()){
            case R.id.btn_1:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("1");
                } else {
                    text.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_2:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("2");
                } else {
                    text.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_3:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("3");
                } else {
                    text.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_4:
                if (text.getText().toString().equals("0")|| isOperationClick) {
                    text.setText("4");
                } else {
                    text.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_5:
                if (text.getText().toString().equals("0") || isOperationClick ) {
                    text.setText("5");
                } else {
                    text.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_6:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("6");
                } else {
                    text.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_7:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("7");
                } else {
                    text.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_8:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("8");
                } else {
                    text.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_9:
                if (text.getText().toString().equals("0") || isOperationClick) {
                    text.setText("9");
                } else {
                    text.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_0:
                if (text.getText().toString().equals("0") || isOperationClick ) {
                    text.setText("0");
                } else {
                    text.append("0");
                }
                isOperationClick = false;
                break;
            case R.id.btn_AC:
                secondActivity.setAlpha(0);
                text.setText("0");
                first = 0;
                second = 0;
                break;
        }
    }


    public void onOperationClick(View view) {
        secondActivity.setAlpha(0);
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.parseInt(text.getText().toString());
                operationSelected = "+";
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                first = Integer.parseInt(text.getText().toString());
                operationSelected = "-";
                isOperationClick = true;
                break;
            case R.id.btn_umnogenie:
                first = Integer.parseInt(text.getText().toString());
                operationSelected = "*";
                isOperationClick = true;
                break;
            case R.id.btn_delenie:
                first = Integer.parseInt(text.getText().toString());
                operationSelected = "/";
                isOperationClick = true;
                break;
            case R.id.btn_procent:
                first = Integer.parseInt(text.getText().toString());
                operationSelected = "%";
                isOperationClick = true;
                break;
            case R.id.btn_plus_minus:
                first = Integer.parseInt(text.getText().toString());
                operationSelected = "+/-";
                isOperationClick = true;
                break;
            case R.id.btn_ravno:
                if (secondActivity.getAlpha() == 0){
                    secondActivity.animate().alpha(1);
                } else {
                    secondActivity.setAlpha(0);
                }
            second = Integer.parseInt(text.getText().toString());
            switch (operationSelected){
                case "+":
                    result = first + second;
                    operation = String.valueOf(result);
                    break;
                case "-":
                    result = first - second;
                    operation = String.valueOf(result);
                    break;
                case "*":
                    result = first * second;
                    operation = String.valueOf(result);
                    break;
                case "/":
                    result = first / second;
                    operation = String.valueOf(result);
                    break;
                case "%":
                    result = first / 100 * second;
                    operation = String.valueOf(result);
                    break;
            }
            text.setText(result.toString());
            isOperationClick = true;
            break;
        }
    }


}