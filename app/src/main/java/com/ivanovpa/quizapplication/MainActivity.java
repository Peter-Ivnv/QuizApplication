package com.ivanovpa.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final LinearLayout movie = findViewById(R.id.movieLayout);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final LinearLayout cartoon = findViewById(R.id.cartoonLayout);

        final Button startQuizBtn = findViewById(R.id.start_quiz_btn);

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            selectedTopic = "movie";
            movie.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        cartoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            selectedTopic = "cartoon";
            cartoon.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopic.isEmpty()){
                    Toast.makeText(MainActivity.this, "Выберите викторину", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}