package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class carpma6 extends AppCompatActivity {

    EditText editTextNumber15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma6);

        editTextNumber15=findViewById(R.id.editTextNumber15);

    }
    public void carpma7gecis(View view){
        if(editTextNumber15.getText().toString().matches("9")){
            carpma8.carpmaToplamSkor++;
        }
        Intent intent=new Intent(carpma6.this,carpma7.class);
        startActivity(intent);
    }
}