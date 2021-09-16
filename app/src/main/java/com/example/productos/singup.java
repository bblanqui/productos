package com.example.productos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class singup extends AppCompatActivity {

    EditText usuario, correo, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        usuario = findViewById(R.id.usuarioup);
        correo = findViewById(R.id.correoup);
        pass = findViewById(R.id.passup);
    }
    public  void  backs (View view){
        Intent intentdos = new Intent(this, MainActivity3.class);
        startActivity(intentdos);
    }
    public  void  logins (View view){
        Intent intentdos = new Intent(this, MainActivity2.class);
        startActivity(intentdos);
    }


    public  void validaciones (View view){

        Validadores validacion = new Validadores(usuario, correo, pass);
    }


}