package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class gunler2 extends AppCompatActivity {

    TextView textView89;
    TextView textView90;

    String[] haftaArray={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
    String[] haftaArrayHint={"Haftanın 1. Günü!","Haftanın 2. Günü!","Haftanın 3. Günü!","Haftanın 4. Günü!","Haftanın 5. Günü!","Haftanın 6. Günü!","Haftanın 7. Günü!"};

    int haftaCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunler2);

        textView89=findViewById(R.id.textView89);
        textView90=findViewById(R.id.textView90);

        textView89.setText(haftaArray[haftaCounter].toString());
        textView90.setText(haftaArrayHint[haftaCounter].toString());

    }
    public void ileriButonu(View view){
        if(haftaCounter<6) {
            haftaCounter++;
            textView89.setText(haftaArray[haftaCounter].toString());
            textView90.setText(haftaArrayHint[haftaCounter].toString());
        }else{
            Toast.makeText(getApplicationContext(),"Haftanın son gününe ulaştınız.",Toast.LENGTH_LONG).show();
        }

    }
    public void geriButonu(View view){
        if(haftaCounter>0) {
            haftaCounter--;
            textView89.setText(haftaArray[haftaCounter].toString());
            textView90.setText(haftaArrayHint[haftaCounter].toString());
        }else{
            Toast.makeText(getApplicationContext(),"Haftanın ilk gününe ulaştınız.",Toast.LENGTH_LONG).show();
        }

    }
    public void gunler3gecis(View view){
        gunler10.gunlertoplamSkor=0;
        Intent intent =new Intent(gunler2.this,gunler3.class);
        startActivity(intent);
    }
}