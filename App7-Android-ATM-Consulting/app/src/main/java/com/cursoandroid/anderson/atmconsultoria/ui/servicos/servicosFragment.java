package com.cursoandroid.anderson.atmconsultoria.ui.servicos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursoandroid.anderson.atmconsultoria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class servicosFragment extends Fragment {


    public servicosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_servicos, container, false);
    }

}
