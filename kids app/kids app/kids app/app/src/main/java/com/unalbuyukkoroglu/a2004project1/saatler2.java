package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saatler2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatler2);
    }

    public void saatler3gecis(View view){


        Intent intent=new Intent(saatler2.this,saatler3.class);
        startActivity(intent);
    }

}