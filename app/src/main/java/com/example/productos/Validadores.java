package com.example.productos;

import android.widget.EditText;
import android.widget.Toast;

public class Validadores {


        EditText correos, contrasenas, usuarios;


        public  Validadores (EditText correos, EditText contrasenas){

        String correo = correos.getText().toString();
        String contrasena = contrasenas.getText().toString();


        if(correo.isEmpty() || !correo.contains("@")){

            showError(correos, "correo invalido");
        }else if(contrasena.isEmpty() || contrasena.length() < 3){

            showError(contrasenas, "contrasena invalida");


        }
    }
    public  Validadores (EditText usuario, EditText correos, EditText contrasenas){

        String usuarios = usuario.getText().toString();
        String correo = correos.getText().toString();
        String contrasena = contrasenas.getText().toString();



        if(usuarios.isEmpty() || usuarios.length() < 3){

            showError(usuario, "usuario invalido");
        }else if(correo.isEmpty() || !correo.contains("@")){

            showError(correos, "correo invalido");


        }else if (contrasena.isEmpty() || contrasena.length() < 3){
            showError(contrasenas, "contraseña invalida");

        }
    }




        public  void showError(EditText entrada, String texto){

            entrada.setError(texto);
            entrada.requestFocus();


        }


}
