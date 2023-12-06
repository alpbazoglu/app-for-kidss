package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aylar6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar6);
    }
    public void aylar7gecis(View view){
        aylar13.aylartoplamSkor=0;
        Intent intent=new Intent(aylar6.this,aylar7.class);
        startActivity(intent);
    }
}