package com.samaniasoft.caracoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {
    private ImageView imgMoeda;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imgMoeda = (ImageView) findViewById(R.id.moedaId); //Estou pegando o id
        btnVoltar = (ImageView) findViewById(R.id.btnVoltarId);

        Bundle extra = getIntent().getExtras(); // Estou pegando o Intent e o Extra da classe main

        if (extra != null){
            String opcapEscolhida = extra.getString("opcao"); //Pegando a key
            if (opcapEscolhida.equals("cara")){
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara)); //pegando a img do Drawable
            }else{
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }

        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class)); //Voltando para outra activity
            }
        });







    }
}
