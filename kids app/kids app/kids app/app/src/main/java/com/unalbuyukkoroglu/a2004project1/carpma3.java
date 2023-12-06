package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class carpma3 extends AppCompatActivity {

    EditText editTextNumber12;
    EditText editTextNumber14;

    TextView textView99;

    int edit12;
    int edit14;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma3);

        editTextNumber12=findViewById(R.id.editTextNumber12);
        editTextNumber14=findViewById(R.id.editTextNumber14);

        textView99=findViewById(R.id.textView99);

    }
    public void carpbutonu(View view){
        edit12 = Integer.parseInt(editTextNumber12.getText().toString());
        edit14 = Integer.parseInt(editTextNumber14.getText().toString());
        textView99.setText("SONUÇ: " + (edit12 * edit14));
    }
    public void carpma4gecis(View view){
        Intent intent=new Intent(carpma3.this,carpma4.class);
        startActivity(intent);
    }
}