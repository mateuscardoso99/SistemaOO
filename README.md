# Filmatoca
Uma alocadara de filmes utilizando como base os padrões de projeto
visto na disciplina e de técnicas de refatoração

### [Conventional_commits](/conventional_commits.md)


```mermaid
classDiagram

    class Media {
      <<Abstract>>
      - String title
      - Double price
      - int quantity
      - MediaCategory category
    }

    class Cd {
      - int durationTime
    }

    class Book {
      - int pages
    }

    class MediaFactory {
      <<interface>>
      + Media create(media)
    }

    class BookFactory{
      @Override
      create()
    }

    class CdFactory{
      @Override
      create()
    }

    Media <|-- Cd
    Media <|-- Book
    MediaFactory <|-- BookFactory
    MediaFactory <|-- CdFactory

    class MediaRequestBuilder{
      <<interface>>
      + MediaRequest mediarequest
      + reset()
      + build()
      + setCategory()
      + setTitle()
      + setQuantity()
      + setPrice()
    }

    class ConcretMediaRequestBuilder{
    
    }

    class MediaRequest{
        - String title
        - Double price
        - int quantity
        - MediaCategory category
    }

    MediaRequestBuilder <|-- ConcretMediaRequestBuilder
    ConcretMediaRequestBuilder <-- MediaRequest
    Media <-- ConcretMediaRequestBuilder

    
    class MediaRepository{
        - MediaRepository instance
        - List<Media> midias
        + getInstance()
        
    }

    MediaRepository 0-- Media
    
    class Customers{
         - String nome
         - String email
         - String celular
         - List<Locacao> locacoes
    }

    class CustomersRepository{
        - CustomersRepository instance
        - List<Customer> customers
        + getInstance()
    }

    CustomersRepository 0-- Customers
    
    class Rental{
    
    }

    class RentalRepository{
        - RentalRepository instance
        - List<Rental> rentals
        + getInstance()
    }

    RentalRepository 0-- Rental

    class Log{
        - int id
        - String mensage
    }

    class LogRepository{
        - id
        - List<Log> logs
        - LogRepository instance
        + getInstance()
    }

    class MediaService{

    }

    MediaRepository <-- MediaService

    class LogService{

    }

    LogRepository <-- LogService

    class RentalService{

    }

    RentalRepository <-- RentalService

    class CustomersService{

    }

    CustomersRepository <-- CustomersService


    LogRepository 0-- Log
```



## Diagram 2

```mermaid
classDiagram
    class Log{
      - int id
      - String 
    }

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
    
    class Customers{
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

    Cliente *-- Locacao

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
