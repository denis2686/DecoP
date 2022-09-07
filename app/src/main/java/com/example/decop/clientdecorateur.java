package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clientdecorateur extends AppCompatActivity {
    Button Cl, De; //deux bouton pour l'inscription

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientdecorateur);

        Cl = (Button) findViewById(R.id.client); //recuperation de id pour l'inscr entreprise
        De = (Button) findViewById(R.id.entreprise); //recuperation de id pour l'inscr entreprise

        Cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clientdecorateur.this, inscriptionC.class);
                startActivity(i);
            }
        });
        De.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clientdecorateur.this, iinscriptionDeco.class);
                startActivity(i);
            }
        });

    }
}