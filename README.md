# 🧠 Design Patterns Comportamentais em Java

Este repositório contém implementações práticas dos principais **Design Patterns Comportamentais**, utilizando a linguagem Java. Cada padrão é acompanhado de ao menos um exemplo realista para facilitar o entendimento e aplicação no mundo real.

---

## 🧠 O que são Design Patterns?

Design Patterns (Padrões de Projeto) são soluções reutilizáveis para problemas comuns encontrados durante o desenvolvimento de software. Os padrões criacionais são responsáveis por abstrair o processo de **criação de objetos**, tornando o sistema mais flexível e desacoplado.

---

## 📌 Padrões Implementados

### 1. Strategy

O padrão **Strategy** permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis em tempo de execução.

**Cenário implementado:**
- **Calculadora de frete**: diferentes estratégias para calcular o custo de frete com base no tipo de entrega (normal, expressa, econômica).

📂 Local:  
strategy/

---

### 2. Chain of Responsibility

O padrão **Chain of Responsibility** permite que objetos formem uma cadeia para processar uma solicitação. Cada objeto na cadeia decide se processa ou passa adiante.

**Cenários implementados:**

- **Suporte Técnico**: níveis de suporte (1, 2 e 3) lidando com problemas conforme seu grau de complexidade.
  
- **Validação de Cadastro de Usuário**: validação encadeada de campos (nome, e-mail e senha) antes de cadastrar um novo usuário.

📂 Local:
chain_of_responsibility

---

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone git@github.com:DaniloTakeo/design_patterns_behavioral.git
```

2. Importe em sua IDE (como IntelliJ ou Eclipse) como um projeto Maven.

3. Navegue até a pasta do padrão desejado e execute a classe Main.java.

---

## 🛠️ Requisitos

- Java 8+
- Maven (para build e gerenciamento de dependências)

---

## 📖 Referências

- Design Patterns: Elements of Reusable Object-Oriented Software – Erich Gamma et al.
- Refactoring Guru – https://refactoring.guru

---

## 👨‍💻 Autor
Danilo Takeo Kanizawa
