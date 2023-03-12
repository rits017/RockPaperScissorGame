package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
private Button exit,bt1,bt2,bt3;
private TextView tv3;
private ImageView im1,im2,im3;
    public static String USER="";
    public static String COMPUTER="";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();
        exit=findViewById(R.id.exit);
        tv3=findViewById(R.id.result);
        tv3.setText("");
        im1=findViewById(R.id.im1);
        im2=findViewById(R.id.im2);
        im3=findViewById(R.id.im3);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);

userChoice();



exit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent n=new Intent(MainActivity3.this,MainActivity.class);
        startActivity(n);
    }
});

    }

    private  String ComputerChoice(){

        Random random=new Random();//created an instance of random class
        int computer= random.nextInt(3);//generates no. in between 0 to2
       Log.d("computerchooses",String.valueOf(computer));

       if(computer==0){
           COMPUTER="ROCK";

       }

       if(computer==1){
           COMPUTER="PAPER";
       }
       if(computer==2){
           COMPUTER="SCISSOR";
       }
       return COMPUTER;
    }

    private  void userChoice() {
        tv3.setText("");
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                USER="ROCK";
                ComputerChoice();
                Toast.makeText(MainActivity3.this, "COMPUTER CHOOSES "+COMPUTER, Toast.LENGTH_SHORT).show();
                result(COMPUTER,USER);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            USER="PAPER";
            ComputerChoice();
                Toast.makeText(MainActivity3.this, "COMPUTER CHOOSES "+COMPUTER, Toast.LENGTH_SHORT).show();
            result(COMPUTER,USER);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                USER="SCISSOR";
ComputerChoice();
                Toast.makeText(MainActivity3.this, "COMPUTER CHOOSES "+COMPUTER, Toast.LENGTH_SHORT).show();
result(COMPUTER,USER);
            }
        });
        
    }
    private void result(String COMPUTER,String USER){
        if(COMPUTER.equals("ROCK")){

           if(USER.equals("ROCK")){
               tv3.setText("MATCH DRAW!");
           }
           else if (USER.equals("PAPER")) {
             tv3.setText("HEYY CONGRATS! YOU WIN");
           }
           else{
               tv3.setText("OOPS! BETTER LUCK NEXT TIME");
           }

        }
        else if (COMPUTER.equals("PAPER")) {
            if(USER.equals("PAPER")){
                tv3.setText("MATCH DRAW!");
            }
            else if (USER.equals("SCISSOR")) {
                tv3.setText("HEYY CONGRATS! YOU WIN");
            }
            else{
                tv3.setText("OOPS! BETTER LUCK NEXT TIME");
            }



        }

        else{

            if(USER.equals("SCISSOR")){
                tv3.setText("MATCH DRAW!");
            }
            else if (USER.equals("ROCK")) {
                tv3.setText("HEYY CONGRATS! YOU WIN");
            }
            else{
                tv3.setText("OOPS! BETTER LUCK NEXT TIME");
            }




        }


    }
        









    }
