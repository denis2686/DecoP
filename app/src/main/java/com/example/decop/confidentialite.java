package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confidentialite extends AppCompatActivity {
    Button dell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confidentialite);

        dell = (Button) findViewById(R.id.sup);

        dell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(confidentialite.this, sup_compte.class);
                startActivity(i);
            }
        });
    }
}