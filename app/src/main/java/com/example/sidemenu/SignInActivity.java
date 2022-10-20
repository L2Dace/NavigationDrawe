package com.example.sidemenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        TextView signup = (TextView) findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showSignUp = new Intent(SignInActivity.this, SignUp.class);
                startActivity(showSignUp);
            }
        });

        AppCompatButton loginbtn = (AppCompatButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("leducduy") && password.getText().toString().equals("123")){
                    //corect
                    Toast.makeText(SignInActivity.this, "Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                    Intent showPro5= new Intent(SignInActivity.this, MainActivity.class);
                    startActivity(showPro5);
                }else
                    //incorrect
                    Toast.makeText(SignInActivity.this, "Đăng nhập thất bại!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}