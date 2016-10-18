package com.carolina.cinemagic;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.carolina.cinemagic.R;

public class Main3Activity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final SharedPreferences sp = getActivity().getSharedPreferences("Opciones_Guardadas", Context.MODE_PRIVATE); // para tener una pref para toda la app

            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) // FRAGMENT 01 EN TAB1
            {
                View rootView = inflater.inflate(R.layout.fragment_sub_page01, container, false);
                TextView tv = (TextView) rootView.findViewById(R.id.titulo_pelicula);
                TextView form = (TextView) rootView.findViewById(R.id.formato);
                ImageView imag = (ImageView) rootView.findViewById(R.id.icon);
                TextView dur = (TextView) rootView.findViewById(R.id.duracion);
                // RatingBar RB = (RatingBar) rootView.findViewById(R.id.ratingBar);
                TextView sinopsis = (TextView) rootView.findViewById(R.id.sinopsis);

                TextView enlace = (TextView) rootView.findViewById(R.id.trailer_link);


                tv.setText(sp.getString("Movie", ""));
                form.setText(sp.getString("Form", ""));
                imag.setImageResource(sp.getInt("Image", 0));
                dur.setText(sp.getString("Duracion", ""));
                //RB.setRating(Float.parseFloat(sp.getString("Puntaje", "")));
                sinopsis.setText(sp.getString("Sinopsis", ""));

                enlace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(sp.getString("Enlaces",""))));

                    }
                });


                return rootView;
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) // FRAGMENT 02 EN TAB2
            {
                final View rootView = inflater.inflate(R.layout.fragment_sub_page02, container, false);

                TextView tv = (TextView) rootView.findViewById(R.id.titulo2);
                TextView form = (TextView) rootView.findViewById(R.id.formato2);
                ImageView imag = (ImageView) rootView.findViewById(R.id.icon2);
                TextView dur = (TextView) rootView.findViewById(R.id.duracion2);

                tv.setText(sp.getString("Movie", ""));
                form.setText(sp.getString("Form", ""));
                imag.setImageResource(sp.getInt("Image", 0));
                dur.setText(sp.getString("Duracion", ""));

                final CheckBox cb1 = (CheckBox) rootView.findViewById(R.id.checkBox1);
                final CheckBox cb2 = (CheckBox) rootView.findViewById(R.id.checkBox2);
                final CheckBox cb3 = (CheckBox) rootView.findViewById(R.id.checkBox3);
                final CheckBox cb4 = (CheckBox) rootView.findViewById(R.id.checkBox4);


                cb1.setChecked(sp.getBoolean("CB1", false));
                cb2.setChecked(sp.getBoolean("CB2", false));
                cb3.setChecked(sp.getBoolean("CB3", false));
                cb4.setChecked(sp.getBoolean("CB4", false));

                cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        sp.edit().putBoolean("CB1", b).commit(); // Guardo el nuevo valor del  CheckBox
                        if (b == true) {
                            cb2.setEnabled(false);
                            cb3.setEnabled(false);
                            cb4.setEnabled(false);

                        } else {
                            cb2.setEnabled(true);
                            cb3.setEnabled(true);
                            cb4.setEnabled(true);
                        }
                    }
                });

                cb2.setChecked(sp.getBoolean("CB2", false));
                cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        sp.edit().putBoolean("CB2", b).commit(); // Guardo el nuevo valor del  CheckBox
                        if (b == true) {
                            cb1.setEnabled(false);
                            cb3.setEnabled(false);
                            cb4.setEnabled(false);

                        } else {
                            cb1.setEnabled(true);
                            cb3.setEnabled(true);
                            cb4.setEnabled(true);
                        }
                    }
                });


                cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        sp.edit().putBoolean("CB3", b).commit(); // Guardo el nuevo valor del  CheckBox
                        if (b == true) {
                            cb1.setEnabled(false);
                            cb2.setEnabled(false);
                            cb4.setEnabled(false);
                        } else {
                            cb1.setEnabled(true);
                            cb2.setEnabled(true);
                            cb4.setEnabled(true);
                        }
                    }
                });


                cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        sp.edit().putBoolean("CB4", b).commit(); // Guardo el nuevo valor del  CheckBox
                        if (b == true) {
                            cb1.setEnabled(false);
                            cb2.setEnabled(false);
                            cb3.setEnabled(false);
                        } else {
                            cb1.setEnabled(true);
                            cb2.setEnabled(true);
                            cb3.setEnabled(true);
                        }

                    }
                });

                return rootView;
            } else {
                View rootView = inflater.inflate(R.layout.fragment_main3, container, false);
                return rootView;
            }
        }
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).


            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // numero total de paginas.
            return 2;
        }

        @Override // titulo de la tab
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Sinopsis";
                case 1:
                    return "Horarios";
            }
            return null;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent paTras = new Intent(this, MainActivity.class);
            startActivity(paTras);
            finish();
        }
        return true;
    }

}
