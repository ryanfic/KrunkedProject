package com.example.krunkedkamloops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("NEATO","Main act!");
    }

    public void onListBtnClick(View view){
        Intent intent = new Intent(this,RestaurantListActivity.class);
        startActivity(intent);
    }
}
