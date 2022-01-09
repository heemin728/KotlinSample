package com.example.kotlinsample;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    int clickCount=0;
    long startTime=System.currentTimeMillis();
    TextView startTimeLabel;
    TextView clickCountLabel;
    TextView a;
    Button button;
    Button reset;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // ui 로 사용할 레이아웃 xml 파일 지정
        setContentView(R.layout.layout_variable);

        // 레이아웃에서 startTimeLabel 을 찾아 바인딩.
        startTimeLabel=findViewById(R.id.startTimeLabel);
        clickCountLabel=findViewById(R.id.clickCountLabel);
        button=findViewById(R.id.button5);
        reset=findViewById(R.id.button6);

        String timeText=new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);

        startTimeLabel.setText("Activity 시작 시간 : "+timeText);
        clickCountLabel.setText("버튼이 클릭된 횟수 : "+clickCount);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                clickCount++;
                clickCountLabel.setText("버튼이 클릭된 횟수 : "+clickCount);
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount=0;
                clickCountLabel.setText("버튼이 클릭된 횟수(초기화) : "+clickCount);
            }
        });


    }
}