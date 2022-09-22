package com.example.and07_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        TextView tv = findViewById(R.id.tv);
        HorizontalScrollView hsv = findViewById(R.id.hsv);
        ScrollView sv = findViewById(R.id.sv);
        //줄바꿈 처리(\n)를 어떻게 했었는지 자바코드. ==이스케이프문장.?
        //for문을 이용해서 텍스트뷰에 append라는 메소드를 이용하여 글씨를 붙여보기.
        for (int i = 0; i < 20 ; i++) {
            tv.append("\n나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!나,백인왜가리강림!");
        }

        

        //Onclick ! <= 버튼이 클릭 되었을때 메소드를 정의한다.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hsv.fullScroll(ScrollView.FOCUS_FORWARD);
                hsv.smoothScrollTo(hsv.getScrollX()+100,0);
            }
        });
        
        


    }
}