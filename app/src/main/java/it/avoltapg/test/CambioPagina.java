package it.avoltapg.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CambioPagina extends AppCompatActivity {
    Button indietro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_pagina);

        indietro = findViewById(R.id.idIndietro);

        indietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiaPagina();
            }
        });
    }

    public void cambiaPagina()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}