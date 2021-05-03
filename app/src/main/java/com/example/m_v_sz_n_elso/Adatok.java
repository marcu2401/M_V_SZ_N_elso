package com.example.m_v_sz_n_elso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Adatok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adatok);

        EditText nev = findViewById(R.id.nev);
        EditText eMail = findViewById(R.id.e_mail);
        EditText Tel = findViewById(R.id.telSzam);
        EditText LCim = findViewById(R.id.SzallCim);
        Button megrendel = findViewById(R.id.megrendel);

        megrendel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Adatok.this, Megrendel.class);
                i.putExtra("nev", nev.getText().toString());
                i.putExtra("eMail", eMail.getText().toString());
                i.putExtra("Tel", Tel.getText().toString());
                i.putExtra("LCim", LCim.getText().toString());
                startActivity(i);
            }
        });
    }
}