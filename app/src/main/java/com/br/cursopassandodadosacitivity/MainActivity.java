package com.br.cursopassandodadosacitivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;


public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void enviar(View view){

        Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

        //Instanciar o objeto
        Usuario usuario = new Usuario("Bruno", "bruno@bordin.com");

        //passar dados
        intent.putExtra("nome", "Pedro de Lara");
        intent.putExtra("idade", 33);
        intent.putExtra("objeto", usuario);

        startActivity(intent);

    }
}