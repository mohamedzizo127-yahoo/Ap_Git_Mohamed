package com.example.apgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String returnName(){
    return "mohamed zizo";
    }
    public String returAge(){
        return "34";
    }
    public int returnAge(){
        return 34;
    }

}
