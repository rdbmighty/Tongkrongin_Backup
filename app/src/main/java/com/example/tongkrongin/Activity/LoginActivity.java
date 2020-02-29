package com.example.tongkrongin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tongkrongin.R;

public class LoginActivity extends AppCompatActivity {

    private RelativeLayout loginbox;
    private ImageView logo;
    private EditText username,password;
    private Button login;
    private TextView register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logo = (ImageView)findViewById(R.id.logo);
        loginbox = (RelativeLayout) findViewById(R.id.box);
        username = (EditText)findViewById(R.id.edt_username);
        password = (EditText)findViewById(R.id.edt_password);
        login = (Button)findViewById(R.id.btn_login);
        register = (TextView)findViewById(R.id.btn_register);


//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                validate(username.getText().toString(), password.getText().toString());
//            }
//        }
//        );

        login = (Button)findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });

        register = (TextView) findViewById(R.id.btn_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegActivity();
            }
        });

    }

    public void nextActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void RegActivity(){
        Intent intent = new Intent(this,RegisterActivity.class);
        Pair[] pairs = new Pair[1];
        pairs[0]=new Pair<View, String>(logo,"LogoTransition");

        ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(this, pairs);

        startActivity(intent,option.toBundle());
    }

//    private void validate(String userName, String userPassword){
//        if ((userName == "Admin")&&(userPassword == "1234")){
//            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
//            startActivity(intent);
//        }
//    }
}