package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class aylargunler extends AppCompatActivity {



    static int aylargunlertoplamskor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylargunler);




        aylargunlertoplamskor=(aylar13.aylartoplamSkor)+(gunler10.gunlertoplamSkor);

    }
    public void aylar1gecis(View view){
        Intent intent=new Intent(aylargunler.this, aylar1.class);
        startActivity(intent);
    }
    public void gunler1gecis(View view){
        Intent intent=new Intent(aylargunler.this, gunler1.class);
        startActivity(intent);
    }
}