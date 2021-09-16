package com.example.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
      EditText correolog, contralog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        correolog= findViewById(R.id.correolog);
        contralog= findViewById(R.id.contralog);
    }

    public  void  back (View view){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public  void  singupss (View view){
        Intent intent = new Intent(this,singup.class);
        startActivity(intent);
    }


  public void validacion (View view){

     Validadores validacion = new Validadores(correolog, contralog);

  }

}