# Filmatoca
Uma alocadara de filmes utilizando como base os padrões de projeto
visto na disciplina e de técnicas de refatoração

### [Conventional_commits](/conventional_commits.md)

![imagem uml]()

```mermaid
classDiagram
    class EventListener
    <<interface>> EventListener
    EventListener : + update()
    
    EventManager <-- MediaService
    EventListener <|-- Customer
    EventListener <-- EventManager

    class EventManager
    EventManager : - EventListener listeners[]
    EventManager : + register()
    EventManager : + unRegister()
    EventManager : + notify()

    class Customer
    Customer : - String nome
    Customer : - String email
    Customer : - String phone
    Customer : - List<Rental> rentals
    Customer : + update()

    class MediaService
    MediaService : - EventManager eventManager
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
