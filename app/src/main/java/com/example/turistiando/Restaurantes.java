package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Restaurante> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica=findViewById(R.id.recyclerRes);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        crearListaRestaurantes();
        AdaptadorRes adaptador= new AdaptadorRes(lista);
        listaLogica.setAdapter(adaptador);
    }
    public void crearListaRestaurantes(){
        lista.add(new Restaurante(R.drawable.restaurante1,"Pizabella","Calle 11 11 05 segundo piso"));
        lista.add(new Restaurante(R.drawable.restaurante2,"Vintage Cafe","Calle 11 #15-08"));
        lista.add(new Restaurante(R.drawable.restaurante3,"Las Delicias del Balcon","Carrera 9 # 11-49"));
        lista.add(new Restaurante(R.drawable.restaurante4,"Cafe con historia","Vereda San Luis"));
    }
}