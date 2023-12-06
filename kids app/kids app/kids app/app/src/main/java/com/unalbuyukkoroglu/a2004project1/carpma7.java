package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class carpma7 extends AppCompatActivity {

    EditText editTextNumber15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma7);

        editTextNumber15=findViewById(R.id.editTextNumber15);

    }
    public void carpma8gecis(View view){
        if(editTextNumber15.getText().toString().matches("0")){
            carpma8.carpmaToplamSkor++;
        }
        Intent intent=new Intent(carpma7.this,carpma8.class);
        startActivity(intent);
    }
}