package it.avoltapg.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CambioPagina extends AppCompatActivity {
    final String TAG = "CambioPagina";
    Button indietro;
    TextView titolo;
    ImageView cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "aa");
        setContentView(R.layout.activity_cambio_pagina);

        titolo = (TextView)findViewById(R.id.idTitolo);
        indietro = findViewById(R.id.idIndietro);
        cover = findViewById(R.id.idCover);

        Intent intent = getIntent();
        int numeroCanzone = intent.getIntExtra("numeroCanzone");
        Log.d(TAG, "aaaaaaaaaaaaaaaaaaaaaaa"+numeroCanzone);

        if(numeroCanzone==10)
        {
            cover.setImageResource(R.drawable.sfera);
        }
        else if(numeroCanzone==11)
        {
            cover.setImageResource(R.drawable.shiva);
        }

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