# 🧠 Design Patterns Comportamentais em Java

Este repositório contém implementações práticas dos principais **Design Patterns Comportamentais**, utilizando a linguagem Java. Cada padrão é acompanhado de ao menos um exemplo realista para facilitar o entendimento e aplicação no mundo real.

---

## 🧠 O que são Design Patterns?

Design Patterns (Padrões de Projeto) são soluções reutilizáveis para problemas comuns encontrados durante o desenvolvimento de software. Os padrões comportamentais são responsáveis por abstrair o processo de **interação entre os objetos** do sistema, tornando o sistema mais flexível e desacoplado.

---

## 📌 Padrões Implementados

### 1. Strategy

O padrão **Strategy** permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis em tempo de execução.

**Cenário implementado:**
- **Calculadora de frete**: diferentes estratégias para calcular o custo de frete com base no tipo de entrega (normal, expressa, econômica).

📂 Local:  strategy/

---

### 2. Chain of Responsibility

O padrão **Chain of Responsibility** permite que objetos formem uma cadeia para processar uma solicitação. Cada objeto na cadeia decide se processa ou passa adiante.

**Cenários implementados:**

- **Suporte Técnico**: níveis de suporte (1, 2 e 3) lidando com problemas conforme seu grau de complexidade.
  
- **Validação de Cadastro de Usuário**: validação encadeada de campos (nome, e-mail e senha) antes de cadastrar um novo usuário.

📂 Local: chain_of_responsibility/

---

### 3. Command

O padrão **Command** serve para ncapsular uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou fazer log de solicitações e suportar operações desfazer/refazer.

**Cenários implementados:**

- **Controle remoto universal**
No exemplo, criamos um controle remoto que aceita comandos genéricos para dispositivos como Luz, TV e Ventilador.

### 📝 Destaques
Flexibilidade para adicionar novos dispositivos sem alterar os comandos existentes.

O padrão é ideal para sistemas que precisam de fila de tarefas, macros, agendamento, log ou desfazer/redo.

📂 Local:  command/

---

### 4. Interpreter

**Intenção:** Fornecer uma forma de avaliar sentenças de uma linguagem. Esse padrão é útil para interpretar expressões simples com uma gramática bem definida.

#### 📌 Exemplo 1: Avaliador de expressões matemáticas simples

Neste exemplo, foi criada uma estrutura para interpretar operações matemáticas básicas como soma e subtração, utilizando uma árvore de expressão.

**Vantagens:**
- Fácil extensão (ex: multiplicação, divisão).
- Estrutura de objetos que representa a gramática da linguagem.

#### 📌 Exemplo 2: Validador de permissões com operadores booleanos

Neste cenário, modelamos regras de permissão como uma mini linguagem com operadores lógicos `AND` e `OR`, capaz de avaliar se um usuário possui as permissões necessárias com base em um contexto.

**Vantagens:**
- Aplicável em controle de acesso baseado em regras (RBAC).
- Permite montar árvores lógicas reutilizáveis e combináveis.

📂 Local:  interpreter/

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
