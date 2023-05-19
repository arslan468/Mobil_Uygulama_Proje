package com.example.proje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    EditText ad,password,signinad,signinpassword;
   database db = new database(context);
    Button newussers,signin,direkt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextNumberPassword);
        newussers = findViewById(R.id.button);
        signin = findViewById(R.id.button2);
        signinad = findViewById(R.id.usersignin);
        signinpassword = findViewById(R.id.editTextNumberPassword2);



        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = signinad.getText().toString();
                int kontrolsifre = Integer.parseInt(signinpassword.getText().toString());
                //Intent intent = new Intent(getApplicationContext(), )
                if (username.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Lütfen boş alanları doldurunuz!!!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean checkpass = db.checkAdandPassword(username,kontrolsifre);
                    if (checkpass == true)
                    {
                        Toast.makeText(MainActivity.this,"Giriş Yapıldı",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),Anasayfa.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Hatalı Giriş Yaptınız!!!",Toast.LENGTH_SHORT).show();

                    }
                }



            }
        });

        newussers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ad.getText().toString();
                int sifre = Integer.parseInt(password.getText().toString());
               // db.ekleuser(new kapsul(name,sifre));
                if (name.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Lütfen boş alanları doldurun ", Toast.LENGTH_LONG).show();
                }
                else
                {
                    db.ekleme(new kapsul(sifre,  name));
                    Toast.makeText(context,"Hesabınız Oluşturuldu",Toast.LENGTH_SHORT).show();
                    Toast.makeText(context,"Giriş Yapılıyor",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}