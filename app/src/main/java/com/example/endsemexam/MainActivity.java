package com.example.endsemexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,question2;
    EditText score1, score2, score3, score4, grade1, grade2, grade3, grade4;
    TextView title1, title2, title3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title1 = findViewById(R.id.tvUnits);
        title2 = findViewById(R.id.tvScore);
        title3 = findViewById(R.id.tvGrade);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        question2 = findViewById(R.id.button5);

        score1 = findViewById(R.id.etScore1);
        score2 = findViewById(R.id.etScore2);
        score3 = findViewById(R.id.etScore3);
        score4 = findViewById(R.id.etScore4);

        grade1 = findViewById(R.id.etGrade1);
        grade2 = findViewById(R.id.etGrade2);
        grade3 = findViewById(R.id.etGrade3);
        grade4 = findViewById(R.id.etGrade4);

        b1.setOnClickListener(view -> {
            String grade = generate_grade(Integer.parseInt(score1.getText().toString()));
            grade1.setText(grade);
        });

        b2.setOnClickListener(view -> {
            String grade = generate_grade(Integer.parseInt(score2.getText().toString()));
            grade2.setText(grade);
        });

        b3.setOnClickListener(view -> {
            String grade = generate_grade(Integer.parseInt(score3.getText().toString()));
            grade3.setText(grade);
        });

        b4.setOnClickListener(view -> {
            String grade = generate_grade(Integer.parseInt(score4.getText().toString()));
            grade4.setText(grade);
        });

        question2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Question2.class));
        });

    }

    private String generate_grade(int x) {
        String grade = " ";
        if(x > 0 && x < 40){
            grade = "F";
        }else if(x > 39 && x < 50){
            grade = "D";
        }else if(x > 49 && x < 60){
            grade = "C";
        }else if(x > 59 && x  < 70){
            grade = "B";
        }else if(x > 69){
            grade = "A";
        }
        return grade;
    }
}