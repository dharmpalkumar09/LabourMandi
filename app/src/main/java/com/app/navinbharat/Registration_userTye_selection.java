package com.app.navinbharat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Registration_userTye_selection extends AppCompatActivity implements View.OnClickListener {

    View workerSelected,workSelected,signupNext;
    String userType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_type_user_catagory);
         workerSelected = findViewById(R.id.looking_for_worker_button);
         workSelected = findViewById(R.id.looking_for_work_button);
         signupNext = findViewById(R.id.sign_up_user_type_next);

        workSelected.setOnClickListener(this);
        workerSelected.setOnClickListener(this);
        signupNext.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        System.out.println("Inside on lick");
        switch (v.getId()){
            case R.id.looking_for_work_button:
                workerSelected.setBackgroundResource(R.drawable.button_colour);
                workSelected.setBackgroundResource(R.drawable.click_button_background_color);
                userType = "worker";
                break;
            case R.id.looking_for_worker_button:
                workSelected.setBackgroundResource(R.drawable.button_colour);
                workerSelected.setBackgroundResource(R.drawable.click_button_background_color);
                userType = "owner";
                break;
            case R.id.sign_up_user_type_next:
                if(userType !=null){
                    Intent registrationIntent = new Intent(Registration_userTye_selection.this,RegistrationPage.class);
                    registrationIntent.putExtra("userType",userType);
                    this.startActivity(registrationIntent);
                }
                break;

        }
    }
}
