package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorRes extends RecyclerView.Adapter<AdaptadorRes.viewHolder> {

    public ArrayList<Restaurante> listaRestaurantes;

    //Constructor
    public AdaptadorRes(ArrayList<Restaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRes.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item2,null,false);
        return new AdaptadorRes.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRes.viewHolder viewHolder, int i) {

        viewHolder.actualizarDatos(listaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();}
    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoRes;
        TextView nombreRes;
        TextView direccionRes;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRes=itemView.findViewById(R.id.fotoRes);
            nombreRes=itemView.findViewById(R.id.nombreRes);
            direccionRes=itemView.findViewById(R.id.direccionRes);
        }

        public void actualizarDatos(Restaurante restaurante) {

            fotoRes.setImageResource(restaurante.getFotografia());
            nombreRes.setText(restaurante.getNombre());
            direccionRes.setText(restaurante.getDireccion());

        }
    }

}
