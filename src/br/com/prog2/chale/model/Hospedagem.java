package br.com.prog2.chale.model;

import java.util.Date;

public class Hospedagem {
    public int id;
    public String estado;
    public Date dataInicio;
    public Date dataFim;
    public int qtdPessoas;
    public float desconto;
    public float valorFinal;
    
    public Hospedagem(int id, String estado, Date dataInicio, Date dataFim, int qtdPessoas, float desconto, float valorFinal) {
        this.id = id;
        this.estado = estado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.qtdPessoas = qtdPessoas;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
    }
    
    // Métodos getters e setters para cada atributo
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Date getDataFim() {
        return dataFim;
    }
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    public float getDesconto() {
        return desconto;
    }
    
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    public float getValorFinal() {
        return valorFinal;
    }
    
    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
}
