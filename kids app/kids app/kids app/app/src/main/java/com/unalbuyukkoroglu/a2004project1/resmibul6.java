package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resmibul6 extends AppCompatActivity {

    TextView textView52;

    static int resmiBulToplamSkor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resmibul6);

        textView52=findViewById(R.id.textView52);

        textView52.setText(String.valueOf(resmiBulToplamSkor));

    }
    public void resmibuldananasayfaya(View view){
        Intent intent=new Intent(resmibul6.this,egitimmitestmi.class);
        startActivity(intent);
    }
}