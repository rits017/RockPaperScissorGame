package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
private Button bthead,bttail,btexit;
private TextView tv2;
    public static String USER1="";
    public static String COMPUTER1="";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        btexit=findViewById(R.id.btexit);
        bthead=findViewById(R.id.bthead);
        bttail=findViewById(R.id.bttail);
        tv2=findViewById(R.id.tvv);
        btexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n1=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(n1);
            }
        });
        userChoice1();

    }
    private  String ComputerChoice1(){

        Random random=new Random();//created an instance of random class
        int computer1= random.nextInt(2);//generates no. in between 0 to2
        Log.d("computerchooses",String.valueOf(computer1));

        if(computer1==0){
            COMPUTER1="HEAD";

        }

        if(computer1==1){
            COMPUTER1="TAIL";
        }

        return COMPUTER1;
    }
    private  void userChoice1() {
        tv2.setText("");
        bthead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                USER1="HEAD";
                ComputerChoice1();
                Toast.makeText(MainActivity2.this, COMPUTER1+" Occurs!", Toast.LENGTH_SHORT).show();
                result(COMPUTER1,USER1);
            }
        });
        bttail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                USER1="TAIL";
                ComputerChoice1();
                Toast.makeText(MainActivity2.this,  COMPUTER1+" Occurs!", Toast.LENGTH_SHORT).show();
                result(COMPUTER1,USER1);
            }
        });


    }




    private void result(String COMPUTER,String USER){
        if(COMPUTER1.equals("HEAD")){

            if(USER1.equals("HEAD")){
                tv2.setText("YOU WON!");
            }

            else{
                tv2.setText("OOPS! BETTER LUCK NEXT TIME");
            }

        }
         if (COMPUTER1.equals("TAIL")) {
            if(USER1.equals("TAIL")){
                tv2.setText("YOU WON");
            }

            else{
                tv2.setText("OOPS! BETTER LUCK NEXT TIME");
            }

        }






    }}