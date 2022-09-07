package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class connexionC extends AppCompatActivity {
    TextView compt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion_c);

        compt = (TextView) findViewById(R.id.cree);

        compt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(connexionC.this, inscriptionC.class);
                startActivity(i);
            }
        });

        FragmentManager fragmentManage = getSupportFragmentManager();
        Button acc = findViewById(R.id.boutonconexion);
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(connexionC.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}