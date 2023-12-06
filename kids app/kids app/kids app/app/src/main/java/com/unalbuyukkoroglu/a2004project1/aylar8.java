package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aylar8 extends AppCompatActivity {

    static int aylarsekizSkor=0;

    EditText editTextNumber10;
    EditText editTextNumber11;

    EditText editTextText7;
    EditText editTextText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aylar8);

        editTextText7=findViewById(R.id.editTextText7);
        editTextText10=findViewById(R.id.editTextText10);
        editTextNumber10=findViewById(R.id.editTextNumber10);
        editTextNumber11=findViewById(R.id.editTextNumber11);

    }
    public void aylar9gecis(View view){

        if(editTextText7.getText().toString().matches("ilkbahar")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextText10.getText().toString().matches("sonbahar")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber10.getText().toString().matches("3")){
            aylar13.aylartoplamSkor++;
        }
        if(editTextNumber11.getText().toString().matches("9")){
            aylar13.aylartoplamSkor++;
        }

        Intent intent=new Intent(aylar8.this,aylar9.class);
        startActivity(intent);
    }
}