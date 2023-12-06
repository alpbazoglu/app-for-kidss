package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yonler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonler);
    }
    public void yonler2gecis(View view){
        Intent intent=new Intent(yonler.this,yonler2.class);
        startActivity(intent);
    }
}