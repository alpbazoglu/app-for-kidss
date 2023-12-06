package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gunler9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunler9);
    }

    public void pazartesi(View view){
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }
    public void sali(View view){
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }
    public void carsamba(View view){
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }
    public void persembe(View view){
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }
    public void cuma(View view){
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }
    public void cumartesi(View view){
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }
    public void pazar(View view){
        gunler10.gunlertoplamSkor++;
        Intent intent=new Intent(gunler9.this,gunler10.class);
        startActivity(intent);
    }

}