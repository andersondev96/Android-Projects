package com.cursoandroid.anderson.atmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursoandroid.anderson.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class sobreFragment extends Fragment {


    public sobreFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "A ATM Consultoria tem como missão apoiar organizações " +
                "que desejam alcançar o sucesso através da excelência em gestão e " +
                "da busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage( getActivity())
                .setImage(R.drawable.logo )
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com/", "Acesse o nosso site")

                .addGroup("Redes Sociais")
                .addFacebook("anderson.fernandes.31392", "Facebook")
                .addInstagram("anderson_ff13", "Instagram")
                .addTwitter("Anderson130996", "Twitter")
                .addGitHub("AndersonUfop", "Github")
                .addYoutube("UCtRkHg7EoM7FH3lXzA1d_kA", "Youtube")
                .addPlayStore("com.google.android.googlequicksearchbox", "Download App")

                .addItem( versao )


                .create();

        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }

}
