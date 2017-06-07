package com.kxl.atu.databindingexample.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.kxl.atu.databindingexample.BR;

/**
 * Created by atu on 2017/6/6.
 */

public class User extends BaseObservable{

    private String firstName;
    private String lastName;
    private String displayName;
    private int age;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName, int age) {
        this(firstName, lastName);

    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public String getDisplayName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }


}
