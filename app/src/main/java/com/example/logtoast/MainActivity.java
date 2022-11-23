package com.example.logtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button monBouton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monBouton = findViewById(R.id.monBouton);
        textView = findViewById(R.id.textView);
        monBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("MonTag", "bonjour mon enemi");
                Toast.makeText(MainActivity.this, "Bonjourno", Toast.LENGTH_SHORT).show();
            }

        });
    }
}