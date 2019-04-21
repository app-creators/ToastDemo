package com.example.abilash.toastdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ButtonClicked (View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        Toast.makeText(this,editText.getText().toString(), Toast.LENGTH_SHORT).show();




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
