# Filmatoca
Uma alocadara de filmes utilizando como base os padrões de projeto
visto na disciplina e de técnicas de refatoração

### [Conventional_commits](/conventional_commits.md)

![imagem uml]()

```mermaid
classDiagram
    class Locadora{
      - String nome
      - List<Cliente> clientes
      - List<Filme> filmes
    }
    
    class Locacao{
      - List<Filme> filmes
      - LocalDateTime inicio
      - LocalDateTime fim
      - Double multa_diaria
      - Pagamento pagamento
      - Enum status
    }
    
    class Cliente{
     - String nome
     - String email
     - String celular
     - List<Locacao> locacoes
    }

    class Filme{
    - String nome
    - Enum categoria
    - Double valor
    - Int quantidade
    }

    class Pagamento{
    
    }

    Locadora o-- Filme 

    Locadora o-- Cliente

    Locacao *-- Filme

    Locacao -- Pagamento
```

## Iniciar projeto com maven

```bash
mvn archetype:generate -DgroupId=com.locadora \
    -DartifactId=locadora-filmes \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
```


```bash
mvn clean package
java -jar target/locadora-filmes-1.0-SNAPSHOT.jar
```
