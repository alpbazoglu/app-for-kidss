package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class skortablosu extends AppCompatActivity {

    TextView textView128;
    TextView textView129;
    TextView textView130;

    TextView textView131;
    TextView textView133;
    TextView textView134;
    TextView textView135;
    TextView textView136;
    TextView textView137;
    TextView textView138;
    TextView textView139;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skortablosu);

        textView128=findViewById(R.id.textView128);
        textView129=findViewById(R.id.textView129);
        textView130=findViewById(R.id.textView130);

        textView131=findViewById(R.id.textView131);
        textView133=findViewById(R.id.textView133);
        textView134=findViewById(R.id.textView134);
        textView135=findViewById(R.id.textView135);
        textView136=findViewById(R.id.textView136);
        textView137=findViewById(R.id.textView137);
        textView138=findViewById(R.id.textView138);
        textView139=findViewById(R.id.textView139);

        textView128.setText("İsim: "+MainActivity.isim);
        textView129.setText("Soyisim: "+MainActivity.soyisim);
        textView130.setText("Yaş: "+MainActivity.yas);

        textView131.setText("Aylar-Günler: "+aylargunler.aylargunlertoplamskor+" Puan");
        textView133.setText("Çarpma: "+carpma8.carpmaToplamSkor+" Puan");
        textView134.setText("Hafıza: "+hafiza4.hafizaToplamSkor+" Puan");
        textView135.setText("Mevsimler: "+mevsimler11.toplamSkorMevsimler+" Puan");
        textView136.setText("Resmi Bul: "+resmibul6.resmiBulToplamSkor+" Puan");
        textView137.setText("Saatler: "+saatler6.toplamSkor+" Puan");
        textView138.setText("Telafuz: "+spelling5.spellingToplamSkor+" Puan");
        textView139.setText("Yönler: "+yonler8.toplamSkor+" Puan");




    }
    public void skortablosundananasayfaya(View view){
        Intent intent =new Intent(skortablosu.this, egitimmitestmi.class);
        startActivity(intent);
    }
}