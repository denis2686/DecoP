package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class securite extends AppCompatActivity {
    TextView conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_securite);

        conf = (TextView) findViewById(R.id.confident);

        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(securite.this, confidentialite.class);
                startActivity(i);
            }
        });
    }
}