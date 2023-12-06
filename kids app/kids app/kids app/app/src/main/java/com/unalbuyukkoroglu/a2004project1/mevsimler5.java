package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mevsimler5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimler5);
    }
    public void mevsimler6gecis(View view){
        Intent intent=new Intent(mevsimler5.this, mevsimler6.class);
        startActivity(intent);
    }
}