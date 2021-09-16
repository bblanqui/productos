package com.example.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public  void  login (View view){
        Intent intentdos = new Intent(this, MainActivity2.class);
        startActivity(intentdos);
    }
    public  void  singup (View view){
        Intent intentdos = new Intent(this, singup.class);
        startActivity(intentdos);
    }
}