public class Filme {
    private String nome;
    private Categoria categoria;
    private Double valor;
    private Integer quantidade;

    public Filme() {}    
    public Filme(String nome, Categoria categoria, Double valor, Integer quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
