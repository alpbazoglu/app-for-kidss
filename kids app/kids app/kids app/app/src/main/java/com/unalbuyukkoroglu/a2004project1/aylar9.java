package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aylar9 extends AppCompatActivity {

    static int aylardokuzSkor=0;

    EditText editTextNumber10;
    EditText editTextNumber11;

    EditText editTextText7;
    EditText editTextText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar9);

        editTextText7=findViewById(R.id.editTextText7);
        editTextText10=findViewById(R.id.editTextText10);
        editTextNumber10=findViewById(R.id.editTextNumber10);
        editTextNumber11=findViewById(R.id.editTextNumber11);

    }
    public void aylar10gecis(View view){

        if(editTextText7.getText().toString().matches("kis")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextText10.getText().toString().matches("ilkbahar")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber10.getText().toString().matches("2")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber11.getText().toString().matches("5")){
            aylar13.aylartoplamSkor++;
        }

        Intent intent=new Intent(aylar9.this,aylar10.class);
        startActivity(intent);
    }
}