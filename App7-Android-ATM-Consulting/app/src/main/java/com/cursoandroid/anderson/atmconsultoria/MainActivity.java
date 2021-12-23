package com.cursoandroid.anderson.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarEmail();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal, R.id.nav_servicos, R.id.nav_clientes,
                R.id.nav_contato, R.id.nav_sobre
        )
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void enviarEmail() {
        String celular = "tel:31971046276";
        String imagem = "https://br.web.img3.acsta.net/pictures/18/08/15/22/09/0358925.jpg";
        String endereco = "https://www.google.com/maps/dir/-19.453068,-43.1068623/parque+ibirapuera/@-21.5048532,-47.1258677,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x94ce59f1069d11d1:0xcb936109af9ce541!2m2!1d-46.6576336!2d-23.5874162";
        //Intent intent = new Intent(  Intent.ACTION_DIAL,Uri.parse());
        //Intent intent = new Intent(  Intent.ACTION_VIEW,Uri.parse(imagem));
        //Intent intent = new Intent(  Intent.ACTION_VIEW,Uri.parse(endereco));

        Intent intent = new Intent(  Intent.ACTION_SEND );

        intent.putExtra( Intent.EXTRA_EMAIL, new String[]{"atmconsultoria.atendimento@atm.com.br"} );
        intent.putExtra( Intent.EXTRA_SUBJECT, "Contato pelo App");
        intent.putExtra( Intent.EXTRA_TEXT, "Mensagem automática");

        //intent.setType( "message/rfc822" );
        //intent.setType( "text/plain" );
        //intent.setType( "image/*" );
        intent.setType( "application/pdf" );


        startActivity( Intent.createChooser(intent, "Escolha um App de e-mail") );
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
