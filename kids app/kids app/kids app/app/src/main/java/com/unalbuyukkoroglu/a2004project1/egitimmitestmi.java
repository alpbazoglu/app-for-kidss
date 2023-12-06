package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class egitimmitestmi extends AppCompatActivity {

    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egitimmitestmi);

        textView4=findViewById(R.id.textView4);

        textView4.setText("Hoşgeldin "+MainActivity.isim+"!");

    }

    public void saatOyunu(View view) {
        saatler6.toplamSkor = 0;
        Intent intent = new Intent(egitimmitestmi.this, saatler.class);
        startActivity(intent);
    }

    public void mevsimOyunu(View view) {
        mevsimler11.toplamSkorMevsimler = 0;
        Intent intent = new Intent(egitimmitestmi.this, mevsimler.class);
        startActivity(intent);
    }

    public void hafizaOyunu(View view) {
        hafiza4.hafizaToplamSkor = 0;
        Intent intent = new Intent(egitimmitestmi.this, hafiza.class);
        startActivity(intent);
    }

    public void yonlerOyunu(View view) {
        yonler8.toplamSkor = 0;
        Intent intent = new Intent(egitimmitestmi.this, yonler.class);
        startActivity(intent);
    }

    public void dikkatOyunu(View view) {
        Intent intent = new Intent(egitimmitestmi.this, toptakibi.class);
        startActivity(intent);
    }

    public void aygunOyunu(View view) {
        Intent intent = new Intent(egitimmitestmi.this, aylargunler.class);
        startActivity(intent);
    }

    public void carpmaOyunu(View view) {
        carpma8.carpmaToplamSkor = 0;
        Intent intent = new Intent(egitimmitestmi.this, carpma1.class);
        startActivity(intent);
    }

    public void spellOyunu(View view) {
        spelling5.spellingToplamSkor = 0;
        Intent intent = new Intent(egitimmitestmi.this, spelling1.class);
        startActivity(intent);
    }

    public void resmibulOyunu(View view) {
        resmibul6.resmiBulToplamSkor = 0;
        Intent intent = new Intent(egitimmitestmi.this, resmibul1.class);
        startActivity(intent);
    }

    public void skorTablosu(View view) {
        Intent intent = new Intent(egitimmitestmi.this, skortablosu.class);
        startActivity(intent);
    }


}