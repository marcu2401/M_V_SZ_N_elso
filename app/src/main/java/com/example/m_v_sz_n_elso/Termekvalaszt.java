package com.example.m_v_sz_n_elso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Termekvalaszt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termekvalaszt);

        RadioButton Gyros = findViewById(R.id.gyros);
        RadioButton Pizza = findViewById(R.id.pizza);
        RadioButton Rantotthus = findViewById(R.id.rantotthus);
        RadioButton Sultkrupli = findViewById(R.id.sultkrumpli);
        Button megadas = findViewById(R.id.megadas);

        megadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Termekvalaszt.this, Adatok.class);
                if (Gyros.isChecked()){
                    i.putExtra("Gyros", Gyros.getText().toString());
                }
                if (Pizza.isChecked()){
                    i.putExtra("Pizza", Pizza.getText().toString());
                }
                if (Rantotthus.isChecked()){
                    i.putExtra("Rantotthus", Rantotthus.getText().toString());
                }
                if (Sultkrupli.isChecked()){
                    i.putExtra("Sultkrumpli", Sultkrupli.getText().toString());
                }
                startActivity(i);
            }
        });

    }
}