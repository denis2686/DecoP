package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inscriptionC extends AppCompatActivity {

    TextView compte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_c);

        compte = (TextView) findViewById(R.id.connexion);

        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(inscriptionC.this, connexionC.class);
                startActivity(i);
            }
        });

        FragmentManager fragmentManage = getSupportFragmentManager();
        Button acc;
        acc = findViewById(R.id.bouton_inscruption);
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(inscriptionC.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}