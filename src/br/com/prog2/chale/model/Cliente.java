package br.com.prog2.chale.model;

import java.util.Date;

public class Cliente {
    public int id;
    public String nomeCliente;
    public int rgCliente;
    public String enderecoCliente;
    public String bairroCliente;
    public String cidadeCliente;
    public String estadoCliente;
    public int CEPCliente;
    public Date nascimentoCliente;
    
    public Cliente(int id, String nomeCliente, int rgCliente, String enderecoCliente, String bairroCliente,
                   String cidadeCliente, String estadoCliente, int CEPCliente, Date nascimentoCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        this.CEPCliente = CEPCliente;
        this.nascimentoCliente = nascimentoCliente;
    }
    
    // Métodos getters e setters para cada atributo
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public int getRgCliente() {
        return rgCliente;
    }
    
    public void setRgCliente(int rgCliente) {
        this.rgCliente = rgCliente;
    }
    
    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    
    public String getBairroCliente() {
        return bairroCliente;
    }
    
    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }
    
    public String getCidadeCliente() {
        return cidadeCliente;
    }
    
    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }
    
    public String getEstadoCliente() {
        return estadoCliente;
    }
    
    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
    public int getCEPCliente() {
        return CEPCliente;
    }
    
    public void setCEPCliente(int CEPCliente) {
        this.CEPCliente = CEPCliente;
    }
    
    public Date getNascimentoCliente() {
        return nascimentoCliente;
    }
    
    public void setNascimentoCliente(Date nascimentoCliente) {
        this.nascimentoCliente = nascimentoCliente;
    }
}
