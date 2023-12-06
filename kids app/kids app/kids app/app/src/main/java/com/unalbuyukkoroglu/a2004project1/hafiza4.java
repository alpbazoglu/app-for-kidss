package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hafiza4 extends AppCompatActivity {

    static int hafizaToplamSkor;
    TextView textView57;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafiza4);

        textView57=findViewById(R.id.textView57);
        hafizaToplamSkor=(hafiza2.hafizaNormalSkor)+(hafiza3.hafizaTersSkor);
        textView57.setText(String.valueOf(hafizaToplamSkor));

    }
    public void anasayfayadonpls(View view){
        Intent intent=new Intent(hafiza4.this,egitimmitestmi.class);
        startActivity(intent);
    }


}