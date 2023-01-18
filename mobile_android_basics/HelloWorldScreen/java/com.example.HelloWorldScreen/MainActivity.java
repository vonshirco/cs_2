package com.example.myapplication; //specifies the package name for the Java files in the application.
// This package name serves as a unique identifier for the application.

import androidx.appcompat.app.AppCompatActivity;
// imports the AppCompatActivity class from the androidx library, which is a class from the Android
// Support Library that provides a compatible implementation of the action bar for older versions of Android.

import android.os.Bundle;
// imports the Bundle class from the android.os package, which is used to pass data between activities.

public class MainActivity extends AppCompatActivity {
// The class MainActivity is defined as a subclass of AppCompatActivity, which means that it inherits
// all the methods and fields of the AppCompatActivity class and can also override some of them.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // The onCreate method is called when the activity is first created. The Bundle parameter, savedInstanceState,
        // is a bundle that can be used to store data across configuration changes, such as screen rotations.
        super.onCreate(savedInstanceState); // is calling the onCreate method of the superclass (AppCompatActivity)
        setContentView(R.layout.activity_main); //The method is used to set the layout of the activity.
        //It inflates the layout specified by the R.layout.activity_main reference and sets it as the current view.
    }
}