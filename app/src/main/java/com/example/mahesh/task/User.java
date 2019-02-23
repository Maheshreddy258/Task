package com.example.mahesh.task;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {

    @SerializedName("UserName")
    @Expose
    public String userName;
    @SerializedName("Loginstatus")
    @Expose
    public Boolean loginstatus;
    @SerializedName("Role")
    @Expose
    public String role;
    @SerializedName("Designation")
    @Expose
    public String designation;
    @SerializedName("ErrorMessage")
    @Expose
    public Object errorMessage;
    @SerializedName("TodaySale")
    @Expose
    public String todaySale;
    @SerializedName("TodayOnboards")
    @Expose
    public String todayOnboards;
    @SerializedName("TodayTarget")
    @Expose
    public String todayTarget;
    @SerializedName("WeekSale")
    @Expose
    public String weekSale;
    @SerializedName("WeekTarget")
    @Expose
    public String weekTarget;
    @SerializedName("WeekOnabord")
    @Expose
    public String weekOnabord;
    @SerializedName("MonthSale")
    @Expose
    public String monthSale;
    @SerializedName("MonthTarget")
    @Expose
    public String monthTarget;
    @SerializedName("MonthOnaord")
    @Expose
    public String monthOnaord;


}
