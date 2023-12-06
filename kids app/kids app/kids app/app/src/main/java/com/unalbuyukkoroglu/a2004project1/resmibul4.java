package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resmibul4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resmibul4);
    }
    public void gozluk(View view){
        resmibul6.resmiBulToplamSkor++;
        Intent intent=new Intent(resmibul4.this,resmibul5.class);
        startActivity(intent);
    }
    public void kalem(View view){
        Intent intent=new Intent(resmibul4.this,resmibul5.class);
        startActivity(intent);
    }
    public void kopek(View view){
        Intent intent=new Intent(resmibul4.this,resmibul5.class);
        startActivity(intent);
    }
    public void silgi(View view){
        Intent intent=new Intent(resmibul4.this,resmibul5.class);
        startActivity(intent);
    }
}