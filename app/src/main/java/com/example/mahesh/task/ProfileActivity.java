package com.example.mahesh.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    TextView UserName,Role,Designation,TodaySale,TodayOnboards,TodayTarget,
            WeekSale,WeekTarget,WeekOnabord,MonthSale,MonthTarget,MonthOnaord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        UserName=findViewById(R.id.userName);
        Role=findViewById(R.id.role);
        Designation=findViewById(R.id.designation);
        TodaySale=findViewById(R.id.todaysale);
        TodayOnboards=findViewById(R.id.TodayOnboards);
        TodayTarget=findViewById(R.id.TodayTarget);
        WeekSale=findViewById(R.id.WeekSale);
        WeekTarget=findViewById(R.id.WeekTarget);
        WeekOnabord=findViewById(R.id.WeekOnabord);
        MonthSale=findViewById(R.id.MonthSale);
        MonthTarget=findViewById(R.id.MonthTarget);
        MonthOnaord=findViewById(R.id.MonthOnaord);

        String userName=getIntent().getStringExtra("userName");
        String role=getIntent().getStringExtra("role");
        String designation=getIntent().getStringExtra("designation");
        String todaySale=getIntent().getStringExtra("todaySale");
        String todayOnboards=getIntent().getStringExtra("todayOnboards");
        String todayTarget=getIntent().getStringExtra("todayTarget");
        String weekSale=getIntent().getStringExtra("weekSale");
        String weekTarget=getIntent().getStringExtra("weekTarget");
        String weekOnabord=getIntent().getStringExtra("weekOnabord");
        String monthSale=getIntent().getStringExtra("monthSale");
        String monthTarget=getIntent().getStringExtra("monthTarget");
        String monthOnaord=getIntent().getStringExtra("monthOnaord");

        UserName.setText(userName);
        Role.setText(role);
        Designation.setText(designation);
        TodaySale.setText(todaySale);
        TodayOnboards.setText(todayOnboards);
        TodayTarget.setText(todayTarget);
        WeekSale.setText(weekSale);
        WeekTarget.setText(weekTarget);
        WeekOnabord.setText(weekOnabord);
        MonthSale.setText(monthSale);
        MonthTarget.setText(monthTarget);
        MonthOnaord.setText(monthOnaord);




    }
}
