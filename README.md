# 💳 Sistema de Pagamento com Decorator

Projeto desenvolvido para demonstrar a aplicação do padrão de projeto **Decorator** em Java, permitindo adicionar funcionalidades dinamicamente a um pagamento.

---

## 📊 Diagrama UML

![Diagrama UML](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBCoKnELT2rKt3AJIv9B2efpStXSip9J4bLgEPIKc1oICrB0Ge20000)

[Ver código do diagrama](docs/diagrama.puml)

---

## 📌 Sobre o Projeto

Este sistema simula um pagamento base que pode receber modificações em tempo de execução, como:

* Descontos
* Taxas adicionais
* Cashback

O objetivo é mostrar como o padrão Decorator permite estender comportamentos sem alterar a classe original.

---

## 🧠 Padrão Utilizado

O **Decorator** permite adicionar responsabilidades a objetos de forma flexível e dinâmica, evitando o uso excessivo de herança.

---

## 🏗️ Estrutura do Projeto

```bash id="p6hqkt"
pagamento
├── app
│   └── Main.java
├── core
│   ├── Pagamento.java
│   └── PagamentoBase.java
└── decorators
    ├── PagamentoDecorator.java
    ├── DescontoDecorator.java
    ├── TaxaDecorator.java
    └── CashbackDecorator.java
```

---

## ▶️ Como Executar

### Rodar a aplicação

Execute a classe `Main.java`

### Rodar os testes

```bash id="sfns38"
mvn test
```

---

## 🧪 Exemplo de Uso

```java id="ss33x6"
Pagamento pagamento = new PagamentoBase(100);

pagamento = new DescontoDecorator(pagamento, 0.10);
pagamento = new TaxaDecorator(pagamento, 5);
pagamento = new CashbackDecorator(pagamento, 0.02);

System.out.println(pagamento.getValor());
```

---

## 📎 Tecnologias

* Java 17
* Maven
* JUnit 5
