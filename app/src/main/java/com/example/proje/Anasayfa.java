package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anasayfa extends AppCompatActivity {

    Context context = this;
    Button HesapMakinesi,MevsimDegisimi,Ackapa,tasmakas,anasayfa,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        HesapMakinesi = findViewById(R.id.b);
        MevsimDegisimi = findViewById(R.id.b1);
        Ackapa = findViewById(R.id.b2);
        tasmakas = findViewById(R.id.b3);
        anasayfa = findViewById(R.id.b4);
        exit = findViewById(R.id.b5);

        HesapMakinesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), hesapmakinesi.class);
                startActivity(intent);
            }
        });

        MevsimDegisimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), com.example.proje.MevsimDegisimi.class);
                startActivity(intent);
            }
        });

        Ackapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), on_off.class);
                startActivity(intent);
            }
        });

        tasmakas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), tas_kagit_makas.class);
                startActivity(intent);
            }
        });

        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Activity.finish();
                //Anasayfa.finish();
                Anasayfa.this.finish();

                // on below line we are exiting our activity
                System.exit(0);
            }
        });
    }
}