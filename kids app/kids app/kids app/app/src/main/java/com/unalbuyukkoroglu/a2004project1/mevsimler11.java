package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mevsimler11 extends AppCompatActivity {

    TextView textView52;

    static int toplamSkorMevsimler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimler11);

        textView52=findViewById(R.id.textView52);

        toplamSkorMevsimler=(mevsimler7.ilkbaharSkor)+(mevsimler8.yazSkor)+(mevsimler9.sonbaharSkor)+(mevsimler10.kisSkor);
        textView52.setText(String.valueOf(toplamSkorMevsimler));


    }
    public void anasayfayadon2 (View view){
        Intent intent=new Intent(mevsimler11.this,egitimmitestmi.class);
        startActivity(intent);
    }
}