package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class on_off extends AppCompatActivity {

    ImageView imageView;
    Switch aSwitch;
    Button bitis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_off);
        bitis = findViewById(R.id.ampulcikis);
        imageView = findViewById(R.id.image_view);
        aSwitch = findViewById(R.id.switch_button);

        bitis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Anasayfa.class);
                startActivity(intent);
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (aSwitch.isChecked())
                {
                    imageView.setImageResource(R.drawable.imageon);
                    aSwitch.setText("ON");
                }
                else
                {
                    imageView.setImageResource(R.drawable.image);
                    aSwitch.setText("OFF");
                }
            }
        });
    }
}