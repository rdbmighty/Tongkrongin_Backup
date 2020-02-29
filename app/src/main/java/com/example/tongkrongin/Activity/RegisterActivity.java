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

import com.example.tongkrongin.R;

public class RegisterActivity extends AppCompatActivity {

    private ImageView logo;
    private EditText name,username,password;
    private Button signup,back;
//    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        logo = (ImageView)findViewById(R.id.logo);

        signup = (Button) findViewById(R.id.btn_Signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signup();
            }
        });

        back = (Button) findViewById(R.id.btn_Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bACK();
            }
        });

    }

    public void Signup(){
        Intent intent = new Intent(this,LoginActivity.class);
        Pair[] pairs = new Pair[1];
        pairs[0]=new Pair<View, String>(logo,"LogoTransition");

        ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(this, pairs);
        startActivity(intent,option.toBundle());
    }

    public void bACK(){
        Intent intent = new Intent(this,LoginActivity.class);
        Pair[] pairs = new Pair[1];
        pairs[0]=new Pair<View, String>(logo,"LogoTransition");

        ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(this, pairs);
        startActivity(intent,option.toBundle());
    }
    }

