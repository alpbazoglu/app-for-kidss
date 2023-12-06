package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saatler3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatler3);
    }

    public void saat4egecis(View view){
        Intent intent=new Intent(saatler3.this, saatler4.class);
        startActivity(intent);
    }

}