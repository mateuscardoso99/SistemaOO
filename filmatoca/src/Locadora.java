package filmatoca.src;
import java.util.ArrayList;
import java.util.List;

public class Locadora{
    private List<Filme> filmes = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private final NotificationService notificationService;
    {
        notificationService = new NotificationService();
    }
    public List<Cliente> getClientes(){
        return clientes;
    }
    public void setClientes(List<Cliente> clientes){
        this.clientes = clientes;
    }
    public List<Filme> getFilmes(){
        return filmes;
    }
    public void setFilmes(List<Filme> filmes){
        this.filmes = filmes;
    }
    public void adicionaCliente(Cliente c){
        getClientes().add(c);
        notificationService.subscribe(c);
    }
    public void adicionaFilme(Filme filme){
        getFilmes().add(filme);
        notificarNovoFilme(filme);
    }
    public boolean alocarFilme(Filme filme){
        if(filme.getQuantidade() > 0){
            filme.setQuantidade(filme.getQuantidade() - 1);
            return true;
        }
        return false;
    }
    public void desalocarFilme(Filme filme){
        int qtdAntes = filme.getQuantidade();
        filme.setQuantidade(filme.getQuantidade() + 1);
        int qtdDepois = filme.getQuantidade();
        if(qtdAntes == 0 && qtdDepois == 1) {
            this.notificarDevolucaoFilme(filme);
        }
    }
    public void notificarDevolucaoFilme(Filme filme){
        notificationService.notifyOuvintes(EventoNotificar.FILME_DEVOLVIDO, filme);
    }
    public void notificarNovoFilme(Filme filme) {
        notificationService.notifyOuvintes(EventoNotificar.NOVO_FILME, filme);
    }
}
