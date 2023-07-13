package br.com.prog2.chale.model;

public class Chale {
    public int id;
    public String localizacao;
    public int capacidade;
    public float valorAltaEstacao;
    public float valorBaixaEstacao;
    
    public Chale(int id, String localizacao,int capacidade, float valorAltaEstacao, float valorBaixaEstacao) {
        this.id = id;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.valorAltaEstacao = valorAltaEstacao;
        this.valorBaixaEstacao = valorBaixaEstacao;
    }
    
    // Métodos getters e setters para cada atributo
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getLocalizacao() {
        return localizacao;
    }
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public float getValorAltaEstacao() {
        return valorAltaEstacao;
    }
    
    public void setValorAltaEstacao(float valorAltaEstacao) {
        this.valorAltaEstacao = valorAltaEstacao;
    }
    
    public float getValorBaixaEstacao() {
        return valorBaixaEstacao;
    }
    
    public void setValorBaixaEstacao(float valorBaixaEstacao) {
        this.valorBaixaEstacao = valorBaixaEstacao;
    }
}
