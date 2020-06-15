package com.example.recyclerview_teste.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview_teste.R;
import com.example.recyclerview_teste.activity.adapter.Adapter;
import com.example.recyclerview_teste.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //configurando com.example.recyclerview_teste.activity.adapter
        Adapter adapter = new Adapter( listaFilmes );
        this.criarFilmes();


        //configurar recyclerview
        //1 - Intanciando um linearLayout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void criarFilmes(){

        Filme filme = new Filme ("Sonic: O filme","Família/Comédia","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Viúva Negra","Ação/Aventura","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Mulher Maravilha 1984","Ação/Aventura","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Mulan","Ação/Aventura","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Kingsman: O Grande Jogo","Ação/Comédia","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("O Homem Invisível","Terror/Thriller","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Bad Boys para Sempre","Ação/Comédia","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Os Novos Mutantes","Terror/Fantasia","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Godzilla vs Kong","Ficção científica/Ação","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Ameaça Profunda","Terror/Ficção científica","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Halloween Kills","Terror/Slasher","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Um Príncipe em Nova York 2","Comédia/Comédia romântica","2020");
        this.listaFilmes.add( filme );

        filme = new Filme ("Bill & Ted: Encare a Música","Comédia/Ficção científica","2020");
        this.listaFilmes.add( filme );
    }
}