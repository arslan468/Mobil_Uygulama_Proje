package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class hesapmakinesi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesapmakinesi);


        EditText etSayi1=(EditText) findViewById(R.id.editTextNumber1);
        EditText etSayi2=(EditText) findViewById(R.id.editTextNumber2);
        RadioButton rbTopla=(RadioButton) findViewById(R.id.radioButton15);
        RadioButton rbCikar=(RadioButton) findViewById(R.id.radioButton14);
        RadioButton rbCarp=(RadioButton) findViewById(R.id.radioButton13);
        RadioButton rbBol=(RadioButton) findViewById(R.id.radioButton12);
        Button btnHesapla=(Button) findViewById(R.id.button);
        Button back = (Button) findViewById(R.id.geri);
        TextView txtSonuc=(TextView) findViewById(R.id.textViewSonuc);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Anasayfa.class);
                startActivity(intent);
            }
        });

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sonuc = 0;
                double sayi1 = Integer.parseInt(etSayi1.getText().toString());
                double sayi2 = Integer.parseInt(etSayi2.getText().toString());
                if (rbTopla.isChecked()) {
                    sonuc = sayi1 + sayi2;
                } else if (rbCikar.isChecked()) {
                    sonuc = sayi1 - sayi2;
                } else if (rbCarp.isChecked()) {
                    sonuc = sayi1 * sayi2;
                } else if (rbBol.isChecked()) {
                    sonuc = sayi1 / sayi2;
                }
                txtSonuc.setText("Sonuç : " + sonuc);
            }
        });

    }
}