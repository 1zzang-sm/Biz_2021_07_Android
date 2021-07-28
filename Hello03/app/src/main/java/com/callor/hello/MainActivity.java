package com.callor.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText input_id = null;
    private TextInputEditText input_pass = null;
    private TextInputEditText input_name = null;
    private TextInputEditText input_email = null;
    private TextInputEditText input_tel = null;
    private TextInputEditText input_addr = null;
    private Button btn_save = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_id = findViewById(R.id.iv_id);
        input_pass = findViewById(R.id.iv_pass);
        input_name = findViewById(R.id.iv_name);
        input_email = findViewById(R.id.iv_email);
        input_tel = findViewById(R.id.iv_tel);
        input_addr = findViewById(R.id.iv_addr);
        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener((view)->{

            String id = input_id.getText().toString();
            String pw = input_pass.getText().toString();
            String name = input_name.getText().toString();
            String email = input_email.getText().toString();
            String tel = input_tel.getText().toString();
            String addr = input_addr.getText().toString();

            String email_pattern = "^[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+$";

            if(id.isEmpty()) {
                input_id.setError("아이디는 반드시 입력해주세요.");
                return;
            }else if(pw.isEmpty()) {
                input_pass.setError("비밀번호는 반드시 입력해주세요.");
                return;
            }else if(name.isEmpty()) {
                input_name.setError("이름은 반드시 입력해주세요.");
                return;
            }else if(email.isEmpty()) {
                input_email.setError("이메일은 반드시 입력해주세요.");
                return;
            }else if(!email.matches(email_pattern)){
                input_email.setError("이메일 형식이 아닙니다.");
                return;
            }else if(tel.isEmpty()) {
                input_tel.setError("전화번호는 반드시 입력해주세요");
                return;
            }else if(addr.isEmpty()) {
                input_addr.setError("주소는 반드시 입력해주세요.");
                return;
            }

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("userid",id);
            intent.putExtra("userpw",pw);
            intent.putExtra("username",name);
            intent.putExtra("useremail",email);
            intent.putExtra("usertel",tel);
            intent.putExtra("useraddr",addr);

            startActivity(intent);
        });




    }
}