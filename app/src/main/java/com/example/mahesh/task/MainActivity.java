package com.example.mahesh.task;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    EditText mEtemail, mEtpass;
    Button mBtnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtemail = (EditText) findViewById(R.id.etunme);
        mEtpass = (EditText) findViewById(R.id.etpass);

        mEtemail.setText("shiva");
        mEtpass.setText("1234");
        mBtnlog = (Button) findViewById(R.id.btnlogin);
        mBtnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });

    }

    private void userLogin() {
        String email = mEtemail.getText().toString().trim();
        String pass = mEtpass.getText().toString().trim();

        if (email.isEmpty()) {
            mEtemail.setError("Username is required");
            mEtemail.requestFocus();
            return;
        }
        if (pass.isEmpty()) {
            mEtpass.setError("Password is required");
            mEtpass.requestFocus();
            return;
        }

        UserRequest userRequest = new UserRequest();

        userRequest.username = email;
        userRequest.pwd = pass;


        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<User> call = apiInterface.getServiceResponse(userRequest);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                        i.putExtra("userName", response.body().userName);
                        i.putExtra("role", response.body().role);
                        i.putExtra("designation", response.body().designation);
                        i.putExtra("todaySale", response.body().todaySale);
                        i.putExtra("todayOnboards", response.body().todayOnboards);
                        i.putExtra("todayTarget", response.body().todayTarget);
                        i.putExtra("weekSale", response.body().weekSale);
                        i.putExtra("weekTarget", response.body().weekTarget);
                        i.putExtra("weekOnabord", response.body().weekOnabord);
                        i.putExtra("monthSale", response.body().monthSale);
                        i.putExtra("monthTarget", response.body().monthTarget);
                        i.putExtra("monthOnaord", response.body().monthOnaord);
                        startActivity(i);
                    }
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "something went wrong", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
