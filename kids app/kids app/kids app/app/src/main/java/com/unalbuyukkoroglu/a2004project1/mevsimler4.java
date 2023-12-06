package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mevsimler4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimler4);
    }
    public void mevsimler5gecis(View view){
        Intent intent = new Intent(mevsimler4.this, mevsimler5.class);
        startActivity(intent);
    }
}