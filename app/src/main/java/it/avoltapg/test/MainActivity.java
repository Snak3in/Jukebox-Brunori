package it.avoltapg.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mostra;
    Button conta;
    Button cambia;
    TextView numero;
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostra = findViewById(R.id.IdMostra);
        conta = findViewById(R.id.IdConta);
        cambia = findViewById(R.id.IdCambia);
        TextView numero = (TextView)findViewById(R.id.IdNumero);

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
                c++;
                numero.setText(c);
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
        startActivity(intent);
    }
}