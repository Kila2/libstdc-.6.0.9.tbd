package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.button1:
                Toast.makeText(this,"Button1 Clicked", Toast.LENGTH_SHORT).show();
                openLocation();
                break;

            case R.id.button2:
                Toast.makeText(this,"Button2 Clicked", Toast.LENGTH_SHORT).show();
                openBiometric();
                break;
        }

    }

    public void openLocation(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openBiometric(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}