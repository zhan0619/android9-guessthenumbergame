package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int num;
    int guess;
    int gnum;
    boolean stop = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = this.getIntent();
        num = intent.getIntExtra("num", 0);
        guess = intent.getIntExtra("guess", 1);
        if(num == 0){
            num = (int)(Math.random()*9)+1;
        }
    }

    public void b(){
        if(stop == false){
            TextView textView = findViewById(R.id.textView4);
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            if(num == gnum){
                textView.setText("O 總共猜了"+guess+"次");
                stop = true;
            }
            else {
                textView.setText("X");
                intent.putExtra("num", num);
                intent.putExtra("guess", guess+1);
                if(num > gnum){
                    intent.putExtra("str", "太小");
                }
                else {
                    intent.putExtra("str", "太大");
                }

                startActivity(intent);
                this.finish();
            }
        }
    }

    public void b1(View view){
        gnum = 1;
        b();
    }

    public void b2(View view){
        gnum = 2;
        b();
    }

    public void b3(View view){
        gnum = 3;
        b();
    }

    public void b4(View view){
        gnum = 4;
        b();
    }

    public void b5(View view){
        gnum = 5;
        b();
    }

    public void b6(View view){
        gnum = 6;
        b();
    }

    public void b7(View view){
        gnum = 7;
        b();
    }

    public void b8(View view){
        gnum = 8;
        b();
    }

    public void b9(View view){
        gnum = 9;
        b();
    }

    public void restart(View view){
        num = (int)(Math.random()*9)+1;
        guess = 1;
        stop = false;
        TextView textView = findViewById(R.id.textView4);
        textView.setText("");
    }
}