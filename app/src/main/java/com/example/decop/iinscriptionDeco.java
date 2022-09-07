package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class iinscriptionDeco extends AppCompatActivity {
    TextView conexion, cree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iinscription_deco);

        conexion = (TextView) findViewById(R.id.connexdeco);
        cree = (TextView) findViewById(R.id.inscruption_deco);

        conexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(iinscriptionDeco.this, connexion_deco.class);
                startActivity(i);
            }
        });

        cree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(iinscriptionDeco.this, home_entreprise.class);
                startActivity(i);
            }
        });
    }
}