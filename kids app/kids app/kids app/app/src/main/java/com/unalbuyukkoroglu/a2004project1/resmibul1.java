package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resmibul1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resmibul1);
    }
    public void resmibul2gecis(View view){
        Intent intent=new Intent(resmibul1.this,resmibul2.class);
        startActivity(intent);
    }
}