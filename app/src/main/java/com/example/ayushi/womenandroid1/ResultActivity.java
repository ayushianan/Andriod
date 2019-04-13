package com.example.ayushi.womenandroid1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tv;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv=(TextView)findViewById(R.id.tvres);
        btnRestart=(Button)findViewById(R.id.btnRestart);
        StringBuffer sb=new StringBuffer();
        sb.append("correct ans:"+QuizActivity.correct);
        sb.append("wrong ans:"+QuizActivity.wrong);
        sb.append("final ans:"+QuizActivity.marks);
        tv.setText(sb);
        QuizActivity.correct=0;
        QuizActivity.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });





    }
}

