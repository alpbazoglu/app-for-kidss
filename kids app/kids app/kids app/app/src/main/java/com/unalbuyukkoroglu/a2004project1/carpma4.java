package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class carpma4 extends AppCompatActivity {

    EditText editTextNumber15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma4);

        editTextNumber15=findViewById(R.id.editTextNumber15);

    }
    public void carpma5gecis(View view){
        if(editTextNumber15.getText().toString().matches("12")){
            carpma8.carpmaToplamSkor++;
        }
        Intent intent=new Intent(carpma4.this,carpma5.class);
        startActivity(intent);
    }
}