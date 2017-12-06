package com.s2next.daggerexample.utils;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by amadeusportes on 05/12/17.
 */

public class Login implements Parcelable {
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("token")
    @Expose
    private String token;

    public Login(int status, String role, String token) {
        this.status = status;
        this.role = role;
        this.token = token;
    }

    public Login() {
    }

    protected Login(Parcel in) {
        status = in.readInt();
        role = in.readString();
        token = in.readString();
    }

    public static final Creator<Login> CREATOR = new Creator<Login>() {
        @Override
        public Login createFromParcel(Parcel in) {
            return new Login(in);
        }

        @Override
        public Login[] newArray(int size) {
            return new Login[size];
        }
    };

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(status);
        dest.writeString(role);
        dest.writeString(token);
    }
}