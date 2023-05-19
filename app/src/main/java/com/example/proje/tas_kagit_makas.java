package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class tas_kagit_makas extends AppCompatActivity {
    ImageView ımggamer,ımgpc;
    TextView txtgamer,txtpc,txtresult;
    Button btnstone,btnpaper,btnscissors,cikis;
    int [] images = {R.drawable.tas,R.drawable.makas,R.drawable.kagit};
    int gamerscor = 0;
    int pcscor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tas_kagit_makas);

        ımggamer = findViewById(R.id.imageView);
        ımgpc = findViewById(R.id.imageView1);
        txtgamer = findViewById(R.id.textView2);
        txtpc = findViewById(R.id.textView3);
        txtresult = findViewById(R.id.textView5);
        btnstone = findViewById(R.id.button);
        btnpaper = findViewById(R.id.button2);
        btnscissors = findViewById(R.id.button3);
        cikis = findViewById(R.id.makasexit);

        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Anasayfa.class);
                startActivity(intent);
            }
        });


        btnstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oyna (0);
            }
        });

        btnscissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oyna(1);
            }
        });

        btnpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oyna(2);
            }
        });

    }

    private void oyna(int i) {
        int pcvote = (int)(Math.random()*3);
        ımggamer.setImageResource(images[i]);
        ımgpc.setImageResource(images[pcvote]);
        if (i == pcvote)
        {
            txtresult.setText("Sonuç Berabere");
        } else if (i < pcvote) {
            txtresult.setText("Sonuç Bilgisayar Kazandı");
            pcscor ++;
            txtpc.setText("Bilgisayar "+pcscor);
        } else if (i > pcvote) {
            txtresult.setText("Sonuç Oyuncu Kazandı");
            gamerscor ++;
            txtgamer.setText("Oyuncu "+ gamerscor);
        }
    }
}