package com.carolina.cinemagic;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.carolina.cinemagic.R.drawable.borde;


public class LenguajeListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] integers;
    private final String[] formato;

    public LenguajeListAdapter(Activity context, String[] itemname, Integer[] integers, String[] formato) {
        super(context, R.layout.fila_lista, itemname);
        this.context=context;
        this.itemname=itemname;
        this.integers=integers;
        this.formato=formato;

    }

    public View getView(int posicion,View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.fila_lista,null,true);


        TextView txtTitle = (TextView) rowView.findViewById(R.id.titulo);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icono);
        TextView etxDescripcion = (TextView) rowView.findViewById(R.id.formato);

        txtTitle.setText(itemname[posicion]);
        imageView.setImageResource(integers[posicion]);
        etxDescripcion.setText(formato[posicion]);

       return rowView;
    }


}