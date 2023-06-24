package com.ivanovpa.quizapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final AppCompatButton newGameBtn = findViewById(R.id.newGameBtn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final TextView correctAnswers = findViewById(R.id.correctAnswers);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final TextView inCorrectAnswers = findViewById(R.id.wrongAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getInCorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswers.setText(String.valueOf("Количесвто верных ответов - " + getCorrectAnswers));
        inCorrectAnswers.setText(String.valueOf("Количесвто неверных ответов - " + getInCorrectAnswers));

        newGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}