package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aylar10 extends AppCompatActivity {

    static int aylaronSkor=0;

    EditText editTextNumber10;
    EditText editTextNumber11;

    EditText editTextText7;
    EditText editTextText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar10);

        editTextText7=findViewById(R.id.editTextText7);
        editTextText10=findViewById(R.id.editTextText10);
        editTextNumber10=findViewById(R.id.editTextNumber10);
        editTextNumber11=findViewById(R.id.editTextNumber11);

    }
    public void aylar11gecis(View view){

        if(editTextText7.getText().toString().matches("yaz")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextText10.getText().toString().matches("sonbahar")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber10.getText().toString().matches("7")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber11.getText().toString().matches("11")){
            aylar13.aylartoplamSkor++;
        }

        Intent intent=new Intent(aylar10.this,aylar11.class);
        startActivity(intent);
    }
}