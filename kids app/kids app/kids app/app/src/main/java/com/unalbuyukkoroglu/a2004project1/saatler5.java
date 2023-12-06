package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class saatler5 extends AppCompatActivity {

    EditText editTextText3;
    EditText editTextText5;
    EditText editTextText4;

    public static int dijitalSaatSkor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saatler5);

        editTextText3=findViewById(R.id.editTextText3);
        editTextText4=findViewById(R.id.editTextText4);
        editTextText5=findViewById(R.id.editTextText5);

        dijitalSaatSkor=0;

    }

    public int getDijitalSaatSkor() {
        return dijitalSaatSkor;
    }

    public void saatler6gecis(View view){

        if(editTextText3.getText().toString().matches("yirmibir-kirkbes")){
            dijitalSaatSkor++;
        }
        if(editTextText4.getText().toString().matches("sekiz-otuzsekiz")){
            dijitalSaatSkor++;
        }
        if(editTextText5.getText().toString().matches("onbes-yirmiuc")){
            dijitalSaatSkor++;
        }

        Intent intent=new Intent(saatler5.this, saatler6.class);
        startActivity(intent);
    }

}