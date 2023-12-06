package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yonler2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonler2);
    }
    public void yonler3gecis(View view){
        Intent intent = new Intent(yonler2.this,yonler3.class);
        startActivity(intent);
    }
}