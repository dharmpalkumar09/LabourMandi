package com.app.navinbharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        View loginButton = findViewById(R.id.user_login);
        View registrationButton = findViewById(R.id.user_registration_button);

        loginButton.setOnClickListener(this);
        registrationButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        System.out.println("Inside on lick");
        switch (v.getId()){
            case R.id.user_login:
            case R.id.user_registration_button:
                this.startActivity(new Intent(LoginActivity.this,Registration_userTye_selection.class));
        }
    }
}
