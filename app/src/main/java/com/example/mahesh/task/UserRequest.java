package com.example.mahesh.task;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserRequest implements Serializable {


    @SerializedName("Displaymessage")
    public String Displaymessage;
    @SerializedName("ApiStatus")
    public boolean ApiStatus;
    @SerializedName("Prmeir")
    public int Prmeir;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Status")
    public int Status;
    @SerializedName("Phone")
    public String Phone;
    @SerializedName("email")
    public String email;
    @SerializedName("Role")
    public String Role;
    @SerializedName("pwd")
    public String pwd;
    @SerializedName("username")
    public String username;
    @SerializedName("Id")
    public int Id;
}
