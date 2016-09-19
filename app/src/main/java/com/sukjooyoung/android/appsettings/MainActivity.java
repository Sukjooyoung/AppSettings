package com.sukjooyoung.android.appsettings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3. 찾은 요소를 타입에 맞게 캐스팅
//        Button btn = (Button) findViewById(R.id.button);
        //4. 버튼의 경우 클릭 같은 이벤트를 감지하기 위해서 리스너라는 것을 달아야한다.
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                changeText();
//            }
//        });

    }
    //파라미터 view v를 입력하는 이유 = 미리 정의되어 있는 온클릭함수랑 비슷한 형태로 만들어주면 프로퍼티에서 찾을 수 있다.
    // 뷰 요소에서 함수를 호출하기 위해서는
    // 1. 함수를 void 타입으로 작성하고
    // 2. View v 파라미터 지정
    public void changeText(View v){
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(BuildConfig.MYURL);
    }




}
