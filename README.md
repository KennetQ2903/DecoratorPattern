# Plantilla
![Plantilla](public/decoratorTemplate.webp)
# Diagrama de clases
![Diagrama de clases](public/DecoratorPattern.png)
# Diagrama de secuencia
```mermaid
sequenceDiagram
    participant Client
    participant Beverage
    participant DarkRoast
    participant Milk
    participant Mocha

    Client->>DarkRoast: new DarkRoast()
    DarkRoast-->>Client: return DarkRoast

    Client->>Milk: new Milk(DarkRoast)
    Milk-->>Client: return Milk

    Client->>Mocha: new Mocha(Milk)
    Mocha-->>Client: return Mocha

    Client->>Mocha: getDescription()
    Mocha->>Milk: getDescription()
    Milk->>DarkRoast: getDescription()
    DarkRoast-->>Milk: "DarkRoast"
    Milk-->>Mocha: "DarkRoast, Milk"
    Mocha-->>Client: "DarkRoast, Milk, Mocha"

    Client->>Mocha: cost()
    Mocha->>Milk: cost()
    Milk->>DarkRoast: cost()
    DarkRoast-->>Milk: 2.89
    Milk-->>Mocha: 2.89 + 0.45
    Mocha-->>Client: 2.89 + 0.45 + 0.20
```