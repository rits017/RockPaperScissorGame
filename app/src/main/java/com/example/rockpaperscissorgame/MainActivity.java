package com.example.rockpaperscissorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,coinflip;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        button=findViewById(R.id.START);
        coinflip=findViewById(R.id.Coinflip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);

            }
        });
coinflip.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent has=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(has);
    }
});
    }
}