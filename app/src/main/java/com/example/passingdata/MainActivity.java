package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View v){
        Intent i=new Intent("com.example.passingdata.SecondActivity");
        i.putExtra("str1", "This is a string");
        i.putExtra("age1", 35);

        Bundle extras=new Bundle();
        extras.putString("str2", "This is another string");
        extras.putInt("age2", 35);
        i.putExtras(extras);
        startActivityForResult(i, 1);
    }
}