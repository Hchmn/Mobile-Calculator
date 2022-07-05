package com.solutionsresource.bootcampdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class DetailsActivity extends AppCompatActivity  {

    private TextView textViewValue;
    private Button btnSeven, btnEight, btnNine, btnFour, btnFive, btnSix, btnOne, btnTwo, btnThree, btnZero, btnDecimal, btnEquals,
            btnAdd, btnSubtract,btnMultiply, btnDivide, btnClear, btnRemoveLastPart;
    private float mainValue, getSecondValue;
    private boolean ifAdd, ifSub, ifMultiply, ifDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        textViewValue = findViewById(R.id.textViewValue);
        //Operators
        btnAdd  = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEquals = findViewById(R.id.btnEqual);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnClear = findViewById(R.id.btnClear);
        btnRemoveLastPart = findViewById(R.id.btnRemoveLastPart);

        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnZero = findViewById(R.id.btnZero);


        btnZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!textViewValue.getText().equals("0")){
                    textViewValue.setText(textViewValue.getText() + "0");
                }
                else{
                    textViewValue.setText("0");
                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("1");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "1");
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("2");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "2");
                }

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("3");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "3");
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("4");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "4");
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("5");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "5");
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("6");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "6");
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("7");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "7");
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("8");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "8");
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText().equals("0")){
                    textViewValue.setText("9");
                }
                else{
                    textViewValue.setText(textViewValue.getText() + "9");
                }
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue.getText() != null || !textViewValue.getText().equals("0")){
                    textViewValue.setText(textViewValue.getText() + ".");
                }

            }
        });

        btnRemoveLastPart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = textViewValue.getText().toString();
                if(text.length() > 1){
                    textViewValue.setText((text.substring(0,text.length()-1)));
                }
                else if (text.length() == 1){
                    textViewValue.setText("0");
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue != null){
                    textViewValue.setText("0");
                    mainValue = 0;
                    getSecondValue = 0;
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue == null){
                    textViewValue.setText("");
                }
                else{
                    mainValue = Float.parseFloat(textViewValue.getText() + "");
                    ifAdd = true;
                    textViewValue.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(textViewValue == null){
                    textViewValue.setText("");
                }

                else{
                    mainValue = Float.parseFloat(textViewValue.getText() + "");
                    ifMultiply = true;
                    textViewValue.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue == null){
                    textViewValue.setText("");
                }

                else{
                    mainValue = Float.parseFloat(textViewValue.getText() + "");
                    ifDivide = true;
                    textViewValue.setText(null);
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(textViewValue == null){
                    textViewValue.setText("");
                }

                else{
                    mainValue = Float.parseFloat(textViewValue.getText() + "");
                    ifSub = true;
                    textViewValue.setText(null);
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSecondValue = Float.parseFloat(textViewValue.getText() + "");
                if(ifAdd){
                    textViewValue.setText(mainValue + getSecondValue + "");
                    ifAdd = false;
                }

                if(ifMultiply){
                    textViewValue.setText(mainValue * getSecondValue + "");
                    ifMultiply = false;
                }

                if(ifDivide){
                    textViewValue.setText(mainValue / getSecondValue + "");
                    ifDivide = false;
                }

                if(ifSub){
                    textViewValue.setText(mainValue - getSecondValue + "");
                    ifSub = false;
                }
            }
        });

    }
}