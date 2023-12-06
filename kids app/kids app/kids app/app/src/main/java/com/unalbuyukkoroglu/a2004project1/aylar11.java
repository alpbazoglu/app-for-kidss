package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aylar11 extends AppCompatActivity {

    static int aylaronbirSkor=0;

    EditText editTextNumber10;
    EditText editTextNumber11;

    EditText editTextText7;
    EditText editTextText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar11);

        editTextText7=findViewById(R.id.editTextText7);
        editTextText10=findViewById(R.id.editTextText10);
        editTextNumber10=findViewById(R.id.editTextNumber10);
        editTextNumber11=findViewById(R.id.editTextNumber11);

    }
    public void aylar12gecis(View view){

        if(editTextText7.getText().toString().matches("kis")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextText10.getText().toString().matches("yaz")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber10.getText().toString().matches("1")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber11.getText().toString().matches("8")){
            aylar13.aylartoplamSkor++;
        }

        Intent intent=new Intent(aylar11.this,aylar12.class);
        startActivity(intent);
    }
}