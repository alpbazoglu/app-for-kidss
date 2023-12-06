package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class saatler4 extends AppCompatActivity {

    EditText editTextText9;
    EditText editTextText8;
    EditText editTextText6;

    public static int analogSaatSkor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatler4);

        editTextText6=findViewById(R.id.editTextText6);
        editTextText8=findViewById(R.id.editTextText8);
        editTextText9=findViewById(R.id.editTextText9);

        analogSaatSkor=0;

    }

    public void saatler5gecis(View view){

        if(editTextText6.getText().toString().matches("11'i 5 geciyor")){
            analogSaatSkor++;
        }
        if(editTextText8.getText().toString().matches("saat 10")) {
            analogSaatSkor++;
        }
        if(editTextText9.getText().toString().matches("12'yi 50 geciyor")) {
            analogSaatSkor++;
        }


        Intent intent=new Intent(saatler4.this, saatler5.class);
        startActivity(intent);
    }




}