package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class parametre extends AppCompatActivity {

    FragmentManager fragmentManage = getSupportFragmentManager();
    CardView acc, deco, sec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametre);

        acc = findViewById(R.id.ho);
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parametre.this, MainActivity.class);
                startActivity(i);
            }
        });

        deco = findViewById(R.id.homedeco);
        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parametre.this, home_entreprise.class);
                startActivity(i);
            }
        });

        sec = findViewById(R.id.security);
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parametre.this, securite.class);
                startActivity(i);
            }
        });

        CardView aide = findViewById(R.id.centre_d_aider);
        aide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parametre.this, centreaide.class);
                startActivity(i);
            }
        });

        CardView about = findViewById(R.id.apropos);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parametre.this, apropos.class);
                startActivity(i);
            }
        });

        CardView off = findViewById(R.id.offline);
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(parametre.this, Deconnexion.class);
                startActivity(i);
            }
        });
    }
}