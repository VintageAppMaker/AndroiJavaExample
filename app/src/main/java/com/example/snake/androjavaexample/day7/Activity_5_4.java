package com.example.snake.androjavaexample.day7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.snake.androjavaexample.R;

public class Activity_5_4 extends AppCompatActivity {
    private Button btnNaver;
    private Button btnDaum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_4);

        btnNaver = (Button)findViewById(R.id.button);
        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_5_4.this, Activity_5_4_second.class);
                i.putExtra("url", "http://www.naver.com");
                startActivity(i);
            }
        });

        btnDaum = (Button)findViewById(R.id.button2);
        btnDaum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_5_4.this, Activity_5_4_second.class);
                i.putExtra("url", "http://www.daum.net");
                startActivity(i);

            }
        });
    }
}
