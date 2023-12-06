package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class carpma2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma2);
    }
    public void carpma3gecis(View view){
        Intent intent=new Intent(carpma2.this,carpma3.class);
        startActivity(intent);
    }
}