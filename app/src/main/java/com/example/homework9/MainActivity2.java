package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    int num;
    int guess;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = this.getIntent();
        num = intent.getIntExtra("num", 0);
        guess = intent.getIntExtra("guess", 1);
        str = intent.getStringExtra("str");

        TextView textView = findViewById(R.id.textView);
        textView.setText("提示"+'\n'+"玩家數字"+str);
    }

    public void guess(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra("num", num);
        intent.putExtra("guess", guess);
        startActivity(intent);
        this.finish();
    }
}