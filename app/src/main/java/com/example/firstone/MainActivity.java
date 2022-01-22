package com.example.firstone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    ImageView btn_plus,btn_minus,btn_multi,btn_divide,btn_ac,btn_d,btn_equal,btn_startbrat,btn_endbrat;
    TextView inputtext,outputtext,Viewtext;
    String data,data2;
    int i;
    int i2;
    char opra;
    String S;
    int sum;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1=findViewById(R.id.image1);
        btn_2=findViewById(R.id.image2);
        btn_3=findViewById(R.id.image3);
        btn_4=findViewById(R.id.image4);
        btn_5=findViewById(R.id.image5);
        btn_6=findViewById(R.id.image6);
        btn_7=findViewById(R.id.image7);
        btn_8=findViewById(R.id.image8);
        btn_9=findViewById(R.id.image9);
        btn_0=findViewById(R.id.image0);
        btn_plus=findViewById(R.id.imageplus);
        btn_minus=findViewById(R.id.imageminus);
        btn_multi=findViewById(R.id.imagemulti);
        btn_divide=findViewById(R.id.imagedivid);
        btn_equal=findViewById(R.id.imageequal);
        btn_ac=findViewById(R.id.imageclear);
        btn_startbrat=findViewById(R.id.imagestart);
        btn_endbrat=findViewById(R.id.imageend);
        btn_d=findViewById(R.id.imagedot);

        inputtext=findViewById(R.id.upertextarea);
        outputtext=findViewById(R.id.textarea);
        Viewtext=findViewById(R.id.viewtext);

        btn_1.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"1");
        });
        btn_0.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"0");
        });
        btn_2.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"2");
        });
        btn_3.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"3");
        });
        btn_4.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"4");
        });
        btn_5.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"5");
        });
        btn_6.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"6");
        });
        btn_7.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"7");
        });
        btn_8.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"8");
        });
        btn_9.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"9");
        });
        btn_plus.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            Viewtext.setText(data+"+");
            i=Integer.parseInt(data);
            opra='+';
            inputtext.setText("");
                });
        btn_minus.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            Viewtext.setText(data+"-");
            opra='-';
            i=Integer.parseInt(data);
            inputtext.setText("");
        });
        btn_divide.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            Viewtext.setText(data+"/");
            i=Integer.parseInt(data);
            opra='/';
            inputtext.setText("");
        });
        btn_multi.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            Viewtext.setText(data+"*");
            i=Integer.parseInt(data);
            opra='*';
            inputtext.setText("");
        });
        btn_endbrat.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+")");
        });
        btn_startbrat.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+"(");
        });
        btn_d.setOnClickListener(view -> {
            data=inputtext.getText().toString();
            inputtext.setText(data+".");
        });
        btn_ac.setOnClickListener(view ->  {
            inputtext.setText("");
            outputtext.setText("");
            Viewtext.setText("");
        });
        btn_equal.setOnClickListener(view -> {
             data = inputtext.getText().toString();
             data2 = Viewtext.getText().toString();
             Viewtext.setText(data2+data);
             i2 =Integer.parseInt(data);
             inputtext.setText("");

             switch (opra){
                 case '+':
                     sum = i+i2;
                     S=Integer.toString(sum);
                     outputtext.setText(S);
                     break;

                 case '-':
                     sum = i-i2;
                     S=Integer.toString(sum);
                     outputtext.setText(S);
                     break;

                 case '/':
                     sum = i/i2;
                     S=Integer.toString(sum);
                     outputtext.setText(S);
                     break;

                 case '*':
                     sum = i*i2;
                     S=Integer.toString(sum);
                     outputtext.setText(S);
                     break;
             }


        });





    }
}