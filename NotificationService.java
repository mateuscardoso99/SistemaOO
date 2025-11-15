import java.util.HashSet;
import java.util.Set;

public class NotificationService {
    private final Set<Ouvinte> ouvintes; 

    public NotificationService() {
        ouvintes = new HashSet<>();
    }

    public void subscribe(Ouvinte ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void unsubscribe(Ouvinte ouvinte) {
        ouvintes.remove(ouvinte);
    }

    public void notifyOuvintes(EventoNotificar evento, Filme filme) {
        ouvintes.forEach(ouvinte -> ouvinte.update(evento.getValue() + ": " + filme.getNome())); 
    }
}