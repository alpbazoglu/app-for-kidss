package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aylar12 extends AppCompatActivity {

    static int aylaronikiSkor=0;

    EditText editTextNumber10;
    EditText editTextNumber11;

    EditText editTextText7;
    EditText editTextText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar12);

        editTextText7=findViewById(R.id.editTextText7);
        editTextText10=findViewById(R.id.editTextText10);
        editTextNumber10=findViewById(R.id.editTextNumber10);
        editTextNumber11=findViewById(R.id.editTextNumber11);

    }
    public void aylar13gecis(View view){

        if(editTextText7.getText().toString().matches("sonbahar")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextText10.getText().toString().matches("ilkbahar")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber10.getText().toString().matches("10")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber11.getText().toString().matches("4")){
            aylar13.aylartoplamSkor++;
        }

        Intent intent=new Intent(aylar12.this,aylar13.class);
        startActivity(intent);
    }
}