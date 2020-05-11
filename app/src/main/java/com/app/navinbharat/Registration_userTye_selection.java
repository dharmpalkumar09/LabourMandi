package com.app.navinbharat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.app.navinbharat.domain.Worker;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
                    System.out.println("User Type is "+userType);
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("http://192.168.4.2:8080/worker/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    WorkerPlaceHolderApi workerPlaceHolderApi = retrofit.create(WorkerPlaceHolderApi.class);
                    Call<Result<String,List<Worker>>> calls = workerPlaceHolderApi.getWorker();

                    calls.enqueue(new Callback<Result<String, List<Worker>>>() {
                                      @Override
                                      public void onResponse(Call<Result<String, List<Worker>>> call, Response<Result<String, List<Worker>>> response) {
                                          if (!response.isSuccessful()){
                                              System.out.println("Response status code is "+response.code());
                                              return;
                                          }
                                          Result<String,List<Worker>> result = response.body();
                                          System.out.println(result);
                                          System.out.println(result.getOutputObject().get(0).getId());
                                          List<Worker> workerList = result.getOutputObject();
                                          System.out.println(workerList);
                                          for (Worker worker : workerList){
                                              System.out.println(worker.getAddress());
                                          }
                                      }

                                      @Override
                                      public void onFailure(Call<Result<String, List<Worker>>> call, Throwable t) {
                                          t.printStackTrace();
                                      }
                                  }

                    );

                    Intent registrationIntent = new Intent(Registration_userTye_selection.this,RegistrationPage.class);
                    registrationIntent.putExtra("userType",userType);
                    this.startActivity(registrationIntent);
                }
                break;

        }
    }
}
