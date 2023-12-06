package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class yonler8 extends AppCompatActivity {

    static int toplamSkor;

    TextView textView52;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonler8);

        textView52=findViewById(R.id.textView52);

        toplamSkor=(yonler4.sagSkor)+(yonler5.solSkor)+(yonler6.onSkor)+(yonler7.arkaSkor);

        textView52.setText(String.valueOf(toplamSkor));

    }
    public void anasayfayadonyonler (View view){
        Intent intent=new Intent(yonler8.this,egitimmitestmi.class);
        startActivity(intent);
    }
}