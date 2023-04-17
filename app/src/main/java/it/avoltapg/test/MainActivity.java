package it.avoltapg.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int c = 0;
    final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mostra = findViewById(R.id.IdMostra);
        Button conta = findViewById(R.id.IdConta);
        Button cambia = findViewById(R.id.IdCambia);
        TextView numero = findViewById(R.id.idNumero);

        mostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(), "ciao a tutti", Toast.LENGTH_LONG);
                t.show();
            }
        });

        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Valore di conta "+ c);
                c++;
                Log.d(TAG, "Valore di conta "+ c);
                String s = String.valueOf(c);
                numero.setText(s);
                Log.d(TAG, " "+ c);
            }
        });

        cambia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiaPagina();
            }
        });
    }

    public void cambiaPagina()
    {
        Intent intent = new Intent(this, CambioPagina.class);
        intent.putExtra("nomeCanzone", c);
        startActivity(intent);
    }
}