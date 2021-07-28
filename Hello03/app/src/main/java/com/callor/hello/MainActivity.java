package com.callor.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText userid = null;
    private TextInputEditText password = null;
    private TextInputEditText input_name = null;
    private TextInputEditText input_email = null;
    private TextInputEditText input_tel = null;
    private TextInputEditText input_addr = null;
    private Button btn_save = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userid = findViewById(R.id.input_id);
        password = findViewById(R.id.input_pass);
        input_name = findViewById(R.id.input_name);
        input_email = findViewById(R.id.input_email);
        input_tel = findViewById(R.id.input_tel);
        input_addr = findViewById(R.id.input_addr);
        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener((view)->{

            String id = userid.getText().toString();
            String pw = password.getText().toString();
            String name = input_name.getText().toString();
            String email = input_email.getText().toString();
            String tel = input_tel.getText().toString();
            String addr = input_addr.getText().toString();

            String email_pattern = "^[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+$";

            if(id.isEmpty()) {
                userid.setError("아이디는 반드시 입력해주세요.");
                return;
            }else if(pw.isEmpty()) {
                password.setError("비밀번호는 반드시 입력해주세요.");
                return;
            }else if(email.isEmpty()) {
                input_email.setError("이메일은 반드시 입력해주세요.");
                return;
            }else if(email.matches(email_pattern)){
                input_email.setError("이메일 형식이 아닙니다.");
                return;
            }else if(name.isEmpty()) {
                input_name.setError("이름은 반드시 입력해주세요.");
            }else if(tel.isEmpty()) {
                input_tel.setError("전화번호는 반드시 입력해주세요");
            }else if(addr.isEmpty()) {
                input_addr.setError("주소는 반드시 입력해주세요.");
            }




        });




    }
}