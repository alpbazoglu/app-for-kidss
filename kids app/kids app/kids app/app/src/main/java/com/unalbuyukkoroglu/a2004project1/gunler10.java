package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class gunler10 extends AppCompatActivity {

    static int gunlertoplamSkor=0;

    TextView textView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunler10);

        textView52=findViewById(R.id.textView52);

        textView52.setText(String.valueOf(gunlertoplamSkor));

    }
    public void gunlerdenanasayfayadon (View view){
        Intent intent=new Intent(gunler10.this,egitimmitestmi.class);
        startActivity(intent);
    }
}