package com.callor.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // xml에 설정된 ImageView를 Java Code에서 사용하기 위한 선언
    private ImageView myImage = null;

    // 이미지를 교체하면서 보여주기 위한 변수 선언
    private int cnt = 0;

    // 이미지 정보를 담을 배열
    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 선언된 ImageView의 xml에 설정된 View를 연결하기
        myImage = findViewById(R.id.my_image);

        // drawable 폴더에 있는 이미지정보를 각 인자값에 담기
        images = new int[3];
        images[0] = R.drawable.title1;
        images[1] = R.drawable.title2;
        images[2] = R.drawable.title3;

        // ImageView를 클릭했을때
        myImage.setOnClickListener((view)->{

            // cnt 변수를 1씩 증가하고
            cnt++;
            // 증가된 cnt변수를 3으로 나머지 연산수행
            int imgNum = cnt % 3;
            // 3개의 배열에 담긴 정보중에 imgNum요소의 정보를
            // ImageView에 세팅하기
            myImage.setImageResource(images[imgNum]);
        });


    }
}