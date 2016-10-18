package com.carolina.cinemagic;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;

import com.carolina.cinemagic.R;

public class SubPage02 extends Fragment {

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private CheckBox cb1,cb2, cb3, cb4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_sub_page02, container, false);

        sp = getActivity().getSharedPreferences("Opciones_Guardadas", Context.MODE_PRIVATE); // para tener una pref para toda la app
        editor=sp.edit();

       // sp2 = getActivity().getSharedPreferences("Opciones_Guardadas2",Context.MODE_PRIVATE); // para tener una pref para toda la app
        //editor2=sp2.edit();

        /*cb1 = (CheckBox) rootView.findViewById(R.id.checkBox1);
        cb2 = (CheckBox) rootView.findViewById(R.id.checkBox2);
        cb3 = (CheckBox) rootView.findViewById(R.id.checkBox3);
        cb4 = (CheckBox) rootView.findViewById(R.id.checkBox4);

        if (cb2.isChecked()==true || cb3.isChecked()==true || cb4.isChecked()==true){
            cb1.setEnabled(false);
        }else{
            cb1.setChecked(sp2.getBoolean("cb1",false)); //cargar aplicaciones
            cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    editor2.putBoolean("cb1", isChecked).commit(); //le asigno a la opcion facebook el estado de
                }
            });
        }


        if (cb1.isChecked()==true || cb3.isChecked()==true || cb4.isChecked()==true){
            cb2.setEnabled(false);
        }else {
            cb2.setChecked(sp2.getBoolean("cb2", false)); //cargar aplicaciones
            cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    editor2.putBoolean("cb2", isChecked).commit(); //le asigno a la opcion facebook el estado de
                }
            });
        }

        if (cb1.isChecked()==true || cb2.isChecked()==true || cb4.isChecked()==true){
            cb3.setEnabled(false);
        }else {
            cb3.setChecked(sp2.getBoolean("cb3", false)); //cargar aplicaciones
            cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    editor2.putBoolean("cb3", isChecked).commit(); //le asigno a la opcion facebook el estado de
                }
            });
        }

        if (cb1.isChecked()==true || cb2.isChecked()==true || cb3.isChecked()==true){
            cb4.setEnabled(false);
        }else {
            cb4.setChecked(sp2.getBoolean("cb4", false)); //cargar aplicaciones
            cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    editor2.putBoolean("cb4", isChecked).commit(); //le asigno a la opcion facebook el estado de
                }
            });
        } */



        return rootView;


    }
}
