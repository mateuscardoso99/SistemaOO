import java.util.ArrayList;
import java.util.List;

public class Cliente implements Ouvinte{
    private String nome;
    private String email;
    private String celular;
    private List<Locacao> locacao = new ArrayList<>();
    
    public Cliente() {
    }
    public Cliente(String nome, String email, String celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public List<Locacao> getLocacao() {
        return locacao;
    }
    public void setLocacao(List<Locacao> locacao) {
        this.locacao = locacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((celular == null) ? 0 : celular.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (celular == null) {
            if (other.celular != null)
                return false;
        } else if (!celular.equals(other.celular))
            return false;
        return true;
    }
    @Override
    public void update(String msg) {
        System.out.println(msg + ". Enviando e-mail para "+ this.email);
    }
}
