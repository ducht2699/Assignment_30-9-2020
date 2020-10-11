package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonNegative;
    Button buttonDot;
    Button buttonEqual;
    Button buttonAdd;
    Button buttonMinus;
    Button buttonMult;
    Button buttonDiv;
    Button buttonDeleteOne;
    Button buttonDeleteAll;
    Button buttonDeleteCurrent;

    TextView historyCal;
    TextView screen;

    long tempNumber = 0;
    long currentCal = 0;

    String currentCalText;

    String math = "false";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();

    }

    private void connectView() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonNegative = (Button) findViewById(R.id.buttonNegative);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDeleteOne = (Button) findViewById(R.id.buttonDeleteOne);
        buttonDeleteAll = (Button) findViewById(R.id.buttonDeleteAll);
        buttonDeleteCurrent = (Button) findViewById(R.id.buttonDeleteCurrent);

        historyCal = (TextView) findViewById(R.id.historyCal);
        screen = (TextView) findViewById(R.id.screen);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);

        buttonDot.setOnClickListener(this);

        buttonAdd.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonDeleteOne.setOnClickListener(this);
        buttonDeleteAll.setOnClickListener(this);
        buttonDeleteCurrent.setOnClickListener(this);

        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempNumber *= -1;
                screen.setText(String.valueOf(tempNumber));
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMath("equal");
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button1.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button1.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }
                break;
            case R.id.button2:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button2.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button2.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button3:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button3.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button3.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button4:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button4.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button4.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button5:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button5.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button5.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }
                break;
            case R.id.button6:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button6.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button6.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button7:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button7.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button7.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button8:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button8.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button8.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button9:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button9.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button9.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;
            case R.id.button0:
                if (this.math.equals("equal")) {
                    currentCal = 0;
                    tempNumber = 0;
                    historyCal.setText("");
                    this.math = "false";
                }
                tempNumber = tempNumber * 10 + Integer.parseInt(button0.getText().toString());
                if (tempNumber <= 2147483647) {
                    screen.setText(String.valueOf(tempNumber));
                    historyCal.append(button0.getText());
                } else {
                    Toast.makeText(v.getContext(), "Limit", Toast.LENGTH_SHORT).show();
                    tempNumber /= 10;
                }

                break;


            case R.id.buttonDeleteAll:
                tempNumber = 0;
                currentCal = 0;
                screen.setText(String.valueOf(tempNumber));
                historyCal.setText("");
                this.math = "false";
                break;
            case R.id.buttonDeleteCurrent:
                screen.setText("0");
                tempNumber = 0;
                break;
            case R.id.buttonDeleteOne:
                tempNumber /= 10;
                screen.setText(String.valueOf(tempNumber));
            case R.id.buttonAdd:
                addMath("add");
                historyCal.append(buttonAdd.getText());
                break;
            case R.id.buttonMinus:
                addMath("minus");
                historyCal.append(buttonMinus.getText());
                break;
            case R.id.buttonMult:
                addMath("mult");
                historyCal.append(buttonMult.getText());
                break;
            case R.id.buttonDiv:
                addMath("div");
                historyCal.append(buttonDiv.getText());
                break;


        }
    }

    private void addMath(String math) {

        switch (this.math) {
            case "false":
                currentCal = tempNumber;
                break;
            case "add":
                currentCal += tempNumber;

                break;
            case "minus":
                currentCal -= tempNumber;

                break;
            case "mult":
                currentCal *= tempNumber;

                break;
            case "div":
                currentCal /= tempNumber;

                break;

        }
        if (math.equals("equal")) {
            historyCal.append(buttonEqual.getText());
        }
        this.math = math;

        tempNumber = 0;
        screen.setText(String.valueOf(currentCal));


    }

}