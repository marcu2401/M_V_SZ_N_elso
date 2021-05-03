package com.example.m_v_sz_n_elso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Megrendel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_megrendel);

        TextView textView4 = findViewById(R.id.textView4);
        TextView textView2 = findViewById(R.id.textView3);
        Bundle extras = getIntent().getExtras();

        if (extras!=null){
            textView2.setText("Neved: "+extras.getString("nev")+", eMail:  "+extras.getString("eMail")+", telefonszám: "+extras.getString("Tel")+", Lakcím: "+extras.getString("LCím")
            );
            textView4.setText("Megrendelt étel: "+extras.getString("Gyros")+extras.getString("Pizza")+extras.getString("Rantotthus")+extras.getString("Sultkrumpli"));

        }
    }
}