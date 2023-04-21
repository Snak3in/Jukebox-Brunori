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
    int numeroCanzone = 1;
    Button indietro;
    Button testo;
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

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            numeroCanzone = extras.getInt("numeroCanzone");
            //The key argument here must match that used in the other activity
        }
        Log.d(TAG, "aaaaaaaaaaaaaaaaaaaaaaa"+numeroCanzone);

        if(numeroCanzone==1)
        {
            cover.setImageResource(R.drawable.sfera);
        }
        else if(numeroCanzone==2)
        {
            cover.setImageResource(R.drawable.shiva);
        }
        else if(numeroCanzone==3)
        {
            cover.setImageResource(R.drawable.rhove);
        }
        else if(numeroCanzone==4)
        {
            cover.setImageResource(R.drawable.thasup);
        }
        else if(numeroCanzone==5)
        {
            cover.setImageResource(R.drawable.lilnasx);
        }

        indietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiaPagina();
            }
        });

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