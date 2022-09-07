package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_entreprise extends AppCompatActivity {
    Button ajout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_entreprise);

        ajout = (Button) findViewById(R.id.expp);

        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home_entreprise.this, ajoutexpe.class);
                startActivity(i);
            }
        });
    }
}