package com.ugb.catalogo_productos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Iniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iniciar = (Button) findViewById(R.id.btniniciar);
        Iniciar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent productos = new Intent(MainActivity.this,Menu_produtos.class);
                startActivity(productos);

            }
        });
    }
}