package com.demo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Locacao {
    private static final Double multaDiaria = 5.80;
    private LocalDate inicioLocacao;
    private LocalDate fimLocacao;
    private Double multaFinal = 0d;
    private StatusLocacao status;
    private FormaPagamento formaPagamento;
    private List<Filme> filmes = new ArrayList<>();
    private Cliente cliente;
    private Locadora locadora;
    public Locacao(
        LocalDate inicioLocacao, 
        LocalDate fimLocacao, 
        FormaPagamento formaPagamento, 
        List<Filme> filmes,
        Cliente cliente,
        Locadora locadora
    ) {
        this.inicioLocacao = inicioLocacao;
        this.fimLocacao = fimLocacao;
        this.formaPagamento = formaPagamento;
        this.status = StatusLocacao.PENDENTE;
        this.cliente = cliente;
        this.locadora = locadora;
        alocarFilmes(filmes);
    }

    public LocalDate getInicioLocacao() {
        return inicioLocacao;
    }
    public void setInicioLocacao(LocalDate inicioLocacao) {
        this.inicioLocacao = inicioLocacao;
    }
    public LocalDate getFimLocacao() {
        return fimLocacao;
    }
    public void setFimLocacao(LocalDate fimLocacao) {
        this.fimLocacao = fimLocacao;
    }
    public Double getMultaDiaria() {
        return multaDiaria;
    }
    public Double getMultaFinal() {
        return multaFinal;
    }
    public void setMultaFinal(Double multaFinal) {
        this.multaFinal = multaFinal;
    }
    public StatusLocacao getStatus() {
        return status;
    }
    public void setStatus(StatusLocacao status) {
        this.status = status;
    }
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public static Double getMultadiaria() {
        return multaDiaria;
    }
    public List<Filme> getFilmes() {
        return filmes;
    }
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Locadora getLocadora() {
        return locadora;
    }
    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }
    public void alocarFilmes(List<Filme> filmes){
        filmes.forEach(f -> {
            if(locadora.alocarFilme(f)){
                getFilmes().add(f);
            }
        });
    }
    public void desalocarFilmes(){
        this.filmes.forEach(f -> {
            locadora.desalocarFilme(f);
        });
    }
}