package com.example.m_v_sz_n_elso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class Termekvalaszt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termekvalaszt);

        CheckBox Gyros = findViewById(R.id.gyros);
        CheckBox Pizza = findViewById(R.id.pizza);
        CheckBox Rantotthus = findViewById(R.id.rantotthus);
        CheckBox Sultkrumpli = findViewById(R.id.sultkrumpli);
        Button megadas = findViewById(R.id.megadas);

        megadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Termekvalaszt.this, Adatok.class);

                if (Gyros.isChecked()){
                    i.putExtra("Gyros",Gyros.getText().toString() );
                }
                if (Pizza.isChecked()){
                    i.putExtra("Pizza",Pizza.getText().toString() );
                }
                if (Rantotthus.isChecked()){
                    i.putExtra("Rantotthus",Rantotthus.getText().toString() );
                }
                if (Sultkrumpli.isChecked()) {
                    i.putExtra("Sultkrumpli", Sultkrumpli.getText().toString());
                }
                startActivity(i);
            }
        });

    }
}