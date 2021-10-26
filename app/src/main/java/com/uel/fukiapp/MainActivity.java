package com.uel.fukiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer,new CollectionFragment()).commit();

//        Handler handler = new Handler();
//        handler.postDelayed(() -> {
//            Intent intent = new Intent(getApplicationContext(), CollectionFragment.class);
//            startActivity(intent);
//        }, 3000);
    }
}