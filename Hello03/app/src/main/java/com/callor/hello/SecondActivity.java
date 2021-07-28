package com.callor.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView my_prof = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        my_prof = findViewById(R.id.txt_myprof);

        Intent intent = getIntent();

        String userid = intent.getExtras().getString("userid");
        String password = intent.getExtras().getString("userpw");
        String name = intent.getExtras().getString("username");
        String email = intent.getExtras().getString("useremail");
        String tel = intent.getExtras().getString("usertel");
        String addr = intent.getExtras().getString("useraddr");

        String msg = String.format("id: %s,\npw:%s,\nname:%s,\nemail:%s,\ntel:%s,\naddr:%s", userid,password,name, email,tel,addr);
        my_prof.setText(msg);
    }
}