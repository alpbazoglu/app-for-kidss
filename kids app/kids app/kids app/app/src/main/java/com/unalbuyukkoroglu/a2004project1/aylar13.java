package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class aylar13 extends AppCompatActivity {

    static int aylartoplamSkor=0;

    TextView textView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar13);

        textView52=findViewById(R.id.textView52);



        textView52.setText(String.valueOf(aylartoplamSkor));
    }
    public void aylardananasayfayadon (View view){
        Intent intent=new Intent(aylar13.this,egitimmitestmi.class);
        startActivity(intent);
    }
}