package com.carolina.cinemagic;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.carolina.cinemagic.R;

public class SubPage01 extends Fragment {

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    TextView titulo, formato, duracion, sinopsis;
    RatingBar stars;
    int item1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sub_page01, container, false);

        sp = getActivity().getSharedPreferences("Opciones_Guardadas", Context.MODE_PRIVATE); // para tener una pref para toda la app
        editor=sp.edit();

   /*     titulo = (TextView) getActivity().findViewById(R.id.titulo);
        formato = (TextView) getActivity().findViewById(R.id.formato);
        duracion = (TextView) getActivity().findViewById(R.id.duracion);
        stars = (RatingBar) getActivity().findViewById(R.id.ratingBar);

        item1= sp.getInt("Movie",0);
        item1=0;
        switch (item1){
            case 0:
                titulo.setText("DEADPOOL");
                formato.setText("Formato: 3D");
                duracion.setText("Duracion: 120 min");
                stars.setRating(4);
                break;
            case 1:
                titulo.setText("Mad Max: Fury Road");
                formato.setText("Formato: 3D");
                duracion.setText("Duracion: 120 min");
                stars.setRating(4);
                break;
            case 2:
                titulo.setText("Finding Dory");
                formato.setText("Formato: 3D");
                duracion.setText("Duracion: 120 min");
                stars.setRating(4);
                break;
            case 3:
                titulo.setText("Civil War");
                formato.setText("Formato: 3D");
                duracion.setText("Duracion: 120 min");
                stars.setRating(4);
                break;
            case 4:
                titulo.setText("The Jungle Book");
                formato.setText("Formato: 3D");
                duracion.setText("Duracion: 120 min");
                stars.setRating(4);
                break;

        }*/

        return rootView;

    }

}
