package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MevsimDegisimi extends AppCompatActivity {

    Button btn,back;
    RadioButton rd1,rd2,rd3,rd4;
    ImageView ımage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsim_degisimi);

        btn = findViewById(R.id.button);
        rd1 = findViewById(R.id.radioButton);
        rd2 = findViewById(R.id.radioButton2);
        rd3 = findViewById(R.id.radioButton3);
        rd4 = findViewById(R.id.radioButton4);
        back = findViewById(R.id.mdbtn3);
        ımage = findViewById(R.id.imageView);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Anasayfa.class);
                startActivity(intent);
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rd1.isChecked())
                {
                    ımage.setImageResource(R.drawable.summer);
                }
                else if (rd2.isChecked())
                {
                    ımage.setImageResource(R.drawable.autumn);
                }
                else if (rd3.isChecked())
                {
                    ımage.setImageResource(R.drawable.winter);
                }
                else if (rd4.isChecked())
                {
                    ımage.setImageResource(R.drawable.spring);
                }
            }
        });
    }
}