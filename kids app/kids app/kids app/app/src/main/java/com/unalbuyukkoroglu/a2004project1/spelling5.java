package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class spelling5 extends AppCompatActivity {

    static int spellingToplamSkor=0;

    TextView textView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spelling5);

        textView52=findViewById(R.id.textView52);

        textView52.setText(String.valueOf(spellingToplamSkor));

    }
    public void spellingdenanasayfayadon (View view){
        Intent intent=new Intent(spelling5.this,egitimmitestmi.class);
        startActivity(intent);

    }
}