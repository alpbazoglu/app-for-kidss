package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class saatler extends AppCompatActivity {

    TextView textView11;
    TextView textView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatler);

        textView11=findViewById(R.id.textView11);
        textView14=findViewById(R.id.textView14);



    }

public void saatleriki (View view){

    Intent intent=new Intent(saatler.this, saatler2.class);
    startActivity(intent);
}

}