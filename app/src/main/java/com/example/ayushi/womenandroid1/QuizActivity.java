package com.example.ayushi.womenandroid1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity  {
    TextView tv;
    Button btnNext;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3;
    String questions[]={"First Android Phone?","Name of Android Version 4.4?","Android is a which kind of software"} ;
    String ans[]={"Motorola droid","kitkat","Operating system"};
    String opt[]={"Mtc-g1","mtc-1","motorola droid","jellybean","kitkat","froyo","operating system","antivirus","application"};

    int flag=0;
    public static int marks,correct,wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tv=(TextView)findViewById(R.id.tvque);
        btnNext=(Button)findViewById(R.id.btnnxt);
        rg=(RadioGroup) findViewById(R.id.radioGroup1);
        rb1=(RadioButton) findViewById(R.id.radio0);
        rb2=(RadioButton) findViewById(R.id.radio1);
        rb3=(RadioButton) findViewById(R.id.radio2);

        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);




        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                RadioButton uans=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String ansText=uans.getText().toString();

                if(ansText.equalsIgnoreCase(ans[flag]))
                {
                    correct++;
                    marks=correct-wrong;
                }
                else
                {
                    wrong++;
                    marks=correct-wrong;
                }
                flag++;
                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*3]);
                    rb2.setText(opt[(flag*3)+1]);
                    rb3.setText(opt[(flag*3)+2]);
                }
                else
                {
                    Intent in=new Intent(getApplicationContext(),ResultActivity.class);
                    startActivity(in);
                }
//                Intent in=new Intent(getApplicationContext(),ResultActivity.class);
//                startActivity(in);
            }
        });


    }
}

