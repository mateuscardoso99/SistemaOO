# Filmatoca
Uma alocadara de filmes utilizando como base os padrões de projeto
visto na disciplina e de técnicas de refatoração

### [Conventional_commits](/conventional_commits.md)

![imagem uml]()

```mermaid
classDiagram
    class Duck{
      +String beakColor
      +swim()
      +quack()
    }
    class Fish{
      -int sizeInFeet
      -canEat()
    }
    class Zebra{
      +bool is_wild
      +run()
    }

    Animal <|-- Duck
    Animal <|-- Fish
    Animal <|-- Zebra

    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
```
`    Animal: +mate()

