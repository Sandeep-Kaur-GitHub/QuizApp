package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int counter=0;
    String FullAnsOfQue1="B - startActivityForResult()";
    String FullAnsOfQue2="C - It will fire at a future point of time";
    String FullAnsOfQue3="C - Android supports small,normal, large and extra-large sizes";
    String FullAnsOfQue4="C - To share the data between applications";
    String FullAnsOfQue5="B - Http response";
    private RadioButton radioBtn1, radioBtn2,radioBtn3,radioBtn4,radioBtn5;
    public void checkAns(View view)
    {
        RadioGroup rg1=findViewById(R.id.FirstQuestion);
        RadioGroup rg2=findViewById(R.id.SecondQuestion);
        RadioGroup rg3=findViewById(R.id.ThirdQuestion);
        RadioGroup rg4=findViewById(R.id.FourthQuestion);
        RadioGroup rg5=findViewById(R.id.FifthQuestion);


            int selectedId=rg1.getCheckedRadioButtonId();
            radioBtn1 =(RadioButton)findViewById(selectedId);
            if(radioBtn1 != null) {
                String s1 = radioBtn1.getText().toString();
                if (FullAnsOfQue1.equals(s1)) {
                    counter += 1;
                }
            }

            int selectedId2=rg2.getCheckedRadioButtonId();
            radioBtn2 =(RadioButton)findViewById(selectedId2);
            if(radioBtn2 !=null) {
                String s2 = radioBtn2.getText().toString();
                if (FullAnsOfQue2.equals(s2)) {
                    counter += 1;
                }
            }

            int selectedId3=rg3.getCheckedRadioButtonId();
            radioBtn3 =(RadioButton)findViewById(selectedId3);
            if(radioBtn3 != null) {
                String s3=radioBtn3.getText().toString();
                if (FullAnsOfQue3.equals(s3)) {
                    counter += 1;
                }
            }
        int selectedId4=rg4.getCheckedRadioButtonId();
        radioBtn4 =(RadioButton)findViewById(selectedId4);
        if(radioBtn4 != null) {
            String s4=radioBtn4.getText().toString();
            if (FullAnsOfQue4.equals(s4)) {
                counter += 1;
            }
        }
        int selectedId5=rg5.getCheckedRadioButtonId();
        radioBtn5 =(RadioButton)findViewById(selectedId5);
        if(radioBtn5 != null) {
            String s5=radioBtn5.getText().toString();
            if (FullAnsOfQue5.equals(s5)) {
                counter += 1;
            }
        }
        Toast.makeText(MainActivity.this,
                "Total correct answers: "+counter
                        +"\n Total Wrong Answers:"+(5-counter)+
                        "\n Correct Answers are:"+"\nQue1: "+FullAnsOfQue1
                +"\nQue2: "+FullAnsOfQue2+"\nQue3: "+FullAnsOfQue3
                        +"\nQue4: "+FullAnsOfQue4+"\nQue5: "+FullAnsOfQue5,
                Toast.LENGTH_LONG).show();

        counter=0;
    }

}