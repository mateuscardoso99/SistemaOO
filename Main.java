import java.time.LocalDate;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Locadora locadora = new Locadora();
        Categoria aventura = new Categoria("aventura");
        Categoria rpg = new Categoria("rpg");
        Cliente c1 = new Cliente("oswaldo", "oswaldo@gmail.com", "999999999");
        Cliente c2 = new Cliente("ana", "ana@ana", "567433253");
        Filme filme1 = new Filme("o senhor dos anéis", aventura, 23.50d, 10);
        Filme filme2 = new Filme("o robbit", aventura, 12.50d, 1);
        Filme filme3 = new Filme("he-man", rpg, 7.90d, 2);
        locadora.adicionaCliente(c1);
        locadora.adicionaCliente(c2);
        locadora.adicionaFilme(filme1);
        locadora.adicionaFilme(filme2);
        locadora.adicionaFilme(filme3);
        Locacao locacao = new Locacao(
                LocalDate.now(), 
                LocalDate.of(2025, 12, 25), 
                FormaPagamento.PIX, 
                Arrays.asList(filme1, filme2), 
                c1,
                locadora
        );
        locacao.desalocarFilmes();

        Locacao locacao2 = new Locacao(
                LocalDate.now(), 
                LocalDate.of(2025, 11, 30), 
                FormaPagamento.PIX, 
                Arrays.asList(filme2), 
                c2,
                locadora
        );
        locacao2.desalocarFilmes();
    }
}