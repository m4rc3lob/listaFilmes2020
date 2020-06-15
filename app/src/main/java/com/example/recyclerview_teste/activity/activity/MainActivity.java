package com.example.recyclerview_teste.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview_teste.R;
import com.example.recyclerview_teste.activity.RecyclerItemClickListener;
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

        //evento de clique
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {

                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "O filme estreia em: " + filme.getEstreiaFilme(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "O filme estreia em: " + filme.getEstreiaFilme(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )

        );

    }

    public void criarFilmes(){

        Filme filme = new Filme ("Sonic: O filme",
                "Família/Comédia",
                "2020",
                "13 de fevereiro",
                R.drawable.sonic);
        this.listaFilmes.add( filme );

        filme = new Filme ("Viúva Negra",
                "Ação/Aventura",
                "2020",
                "29 de outubro",
                R.drawable.black_widow);
        this.listaFilmes.add( filme );

        filme = new Filme ("Mulher Maravilha 1984",
                "Ação/Aventura",
                "2020",
                "13 de agosto de 2020",
                R.drawable.mulher_maravilha_1984);
        this.listaFilmes.add( filme );

        filme = new Filme ("Mulan",
                "Ação/Aventura",
                "2020",
                "24 de julho",
                R.drawable.mulan);
        this.listaFilmes.add( filme );

        filme = new Filme ("Kingsman: O Grande Jogo",
                "Ação/Comédia",
                "2020",
                "13 de fevereiro",
                R.drawable.kings_man);
        this.listaFilmes.add( filme );

        filme = new Filme ("O Homem Invisível",
                "Terror/Thriller",
                "2020",
                "27 de fevereiro",
                R.drawable.homem_invisivel);
        this.listaFilmes.add( filme );

        filme = new Filme ("Bad Boys para Sempre",
                "Ação/Comédia",
                "2020",
                "30 de janeiro",
                R.drawable.badboys3);
        this.listaFilmes.add( filme );

        filme = new Filme ("Os Novos Mutantes",
                "Terror/Fantasia",
                "2020",
                "3 de abril",
                R.drawable.novos_multantes);
        this.listaFilmes.add( filme );

        filme = new Filme ("Godzilla vs Kong",
                "Ficção científica/Ação",
                "2020",
                "18 de novembro",
                R.drawable.godzilla_vs_kong);
        this.listaFilmes.add( filme );

        filme = new Filme ("Ameaça Profunda",
                "Terror/Ficção científica",
                "2020",
                "9 de janeiro",
                R.drawable.ameaca_profunda);
        this.listaFilmes.add( filme );

        filme = new Filme ("Halloween Kills",
                "Terror/Slasher",
                "2020",
                "15 de outubro",
                R.drawable.halloween_kills);
        this.listaFilmes.add( filme );

        filme = new Filme ("Bill & Ted: Encare a Música",
                "Comédia/Ficção científica",
                "2020",
                "21 de agosto",
                R.drawable.bill_e_ted);
        this.listaFilmes.add( filme );
    }
}