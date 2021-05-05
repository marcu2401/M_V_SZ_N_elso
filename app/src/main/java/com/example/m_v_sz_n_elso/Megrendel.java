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
            textView2.setText("Neved: "+extras.getString("nev")+", eMail:  "+extras.getString("eMail")+", telefonszám: "+extras.getString("Tel")+", Lakcím: "+extras.getString("LCim")
            );
            if(extras.containsKey("Gyros")){
                textView4.setText("Megrendelt étel: "+extras.getString("Gyros"));
            }
            else if(extras.containsKey("Pizza")){
                textView4.setText("Megrendelt étel: "+extras.getString("Pizza"));
            }
            else if(extras.containsKey("Rantotthus")){
                textView4.setText("Megrendelt étel: "+extras.getString("Rantotthus"));
            }
            else if(extras.containsKey("Sultkrumpli")){
                textView4.setText("Megrendelt étel: "+extras.getString("Sultkrumpli"));
            }
            else if(extras.containsKey("Sultkrumpli") && extras.containsKey("Rantotthus")){
                textView4.setText("Megrendelt étel: "+extras.getString("Sultkrumpli")+" "+ extras.getString("Rantotthus"));
            }
            else if(extras.containsKey("Gyros")&& extras.containsKey("Rantotthus")){
                textView4.setText("Megrendelt étel: "+extras.getString("Gyros")+" "+extras.getString("Rantotthus"));
            }
            else if(extras.containsKey("Pizza") && extras.containsKey("Rantotthus")){
                textView4.setText("Megrendelt étel: "+extras.getString("Pizza") +" "+extras.getString("Rantotthus"));
            }
            else if(extras.containsKey("Sultkrumpli")&& extras.containsKey("Gyros")){
                textView4.setText("Megrendelt étel: "+extras.getString("Sultkrumpli")+" "+extras.getString("Gyros"));
            }
            else if(extras.containsKey("Pizza") && extras.containsKey("Gyros")){
                textView4.setText("Megrendelt étel: "+extras.getString("Pizza")+" "+extras.getString("Gyros"));
            }
            else if(extras.containsKey("Pizza") && extras.containsKey("Sultkrumpli")){
                textView4.setText("Megrendelt étel: "+extras.getString("Pizza")+" "+extras.getString("Sultkrumpli"));
            }
            else if(extras.containsKey("Pizza") && extras.containsKey("Sultkrumpli")&& extras.containsKey("Rantotthus")){
                textView4.setText("Megrendelt étel: "+extras.getString("Pizza")+" "+extras.getString("Sultkrumpli")+" "+extras.getString("Rantotthus"));
            }
            else if(extras.containsKey("Pizza") && extras.containsKey("Sultkrumpli")&& extras.containsKey("Rantotthus") && extras.containsKey("Gyros")){
                textView4.setText("Megrendelt étel: "+extras.getString("Pizza")+" "+extras.getString("Sultkrumpli")+" "+extras.getString("Rantotthus")+" "+extras.getString("Gyros"));
            }





        }
    }
}