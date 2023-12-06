package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class saatler6 extends AppCompatActivity{

    TextView textView25;

    public static int toplamSkor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatler6);

        textView25=findViewById(R.id.textView25);

        toplamSkor=(saatler4.analogSaatSkor)+(saatler5.dijitalSaatSkor);

        textView25.setText(String.valueOf(toplamSkor));
    }

    public void anasayfayadon(View view){
        Intent intent=new Intent(saatler6.this, egitimmitestmi.class);
        startActivity(intent);
    }

}