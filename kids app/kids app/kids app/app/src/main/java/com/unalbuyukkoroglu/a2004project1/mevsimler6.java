package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mevsimler6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimler6);
    }
    public void mevsimler7gecis(View view){
        Intent intent= new Intent(mevsimler6.this,mevsimler7.class);
        startActivity(intent);
    }
}