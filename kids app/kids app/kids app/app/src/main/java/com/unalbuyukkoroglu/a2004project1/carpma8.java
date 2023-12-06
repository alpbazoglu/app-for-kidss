package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class carpma8 extends AppCompatActivity {

    static int carpmaToplamSkor=0;

    TextView textView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma8);

        textView52=findViewById(R.id.textView52);

        textView52.setText(String.valueOf(carpmaToplamSkor));

    }
    public void carpmadananasayfayadon(View view){
        Intent intent=new Intent(carpma8.this, egitimmitestmi.class);
        startActivity(intent);
    }
}