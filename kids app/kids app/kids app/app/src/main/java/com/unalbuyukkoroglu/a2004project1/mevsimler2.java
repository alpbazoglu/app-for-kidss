package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mevsimler2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimler2);
    }

    public void mevsimler3gecis(View view){
        Intent intent=new Intent(mevsimler2.this,mevsimler3.class);
        startActivity(intent);
    }

}