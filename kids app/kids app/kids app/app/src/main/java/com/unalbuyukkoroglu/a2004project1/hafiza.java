package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hafiza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafiza);
    }

    public void hafiza2gecis(View view){
        Intent intent=new Intent(hafiza.this, hafiza2.class);
        startActivity(intent);
    }
}