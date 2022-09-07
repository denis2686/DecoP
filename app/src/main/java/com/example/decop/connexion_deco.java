package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class connexion_deco extends AppCompatActivity {
    TextView cree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion_deco);

        cree = (TextView) findViewById(R.id.creedeco);

        cree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(connexion_deco.this, iinscriptionDeco.class);
                startActivity(i);
            }
        });
    }
}