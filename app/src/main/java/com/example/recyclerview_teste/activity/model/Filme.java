package com.example.recyclerview_teste.activity.model;

public class Filme {

    private String tituloFilme;
    private String generoFilme;
    private String anoFilme;
    private String estreiaFilme;

    public Filme(){

    }

    public Filme(String tituloFilme, String generoFilme, String anoFilme, String estreiaFilme) {
        this.tituloFilme = tituloFilme;
        this.generoFilme = generoFilme;
        this.anoFilme = anoFilme;
        this.estreiaFilme = estreiaFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(String anoFilme) {
        this.anoFilme = anoFilme;
    }

    public String getEstreiaFilme() {
        return estreiaFilme;
    }

    public void setEstreiaFilme(String estreiaFilme) {
        this.estreiaFilme = estreiaFilme;
    }
}
