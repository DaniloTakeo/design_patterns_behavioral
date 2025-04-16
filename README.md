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

### 5. Iterator

**Intenção:** Fornecer uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação subjacente.

#### 📌 Exemplo 1: Playlist de Músicas

Neste exemplo, criamos uma `Playlist` que armazena várias `Musica`. Um `PlaylistIterator` é utilizado para percorrer as músicas da lista de forma encapsulada, permitindo futuras mudanças na estrutura interna da playlist sem afetar o código cliente.

#### 📌 Exemplo 2: Relatório de Funcionários

Neste cenário, modelamos uma `Empresa` que possui uma lista de `Funcionario`, e queremos gerar relatórios iterando sobre os dados sem depender da implementação da lista. O `EmpresaIterator` cuida da iteração de forma encapsulada.

**Vantagens:**
- Ideal para sistemas que exportam dados ou navegam por objetos complexos.
- A lógica de iteração fica reutilizável e flexível.

📂 Local:  iterator/

---

### 6. Mediator

**Intenção:** Centralizar a comunicação entre objetos relacionados, promovendo o desacoplamento entre eles. Em vez de objetos se referirem diretamente, eles interagem por meio de um objeto mediador.

#### 📌 Exemplo 1: Chat entre usuários

Neste exemplo, usuários enviam mensagens uns para os outros através de um `ChatMediator`, que centraliza o envio e distribuição das mensagens. Nenhum usuário conhece diretamente os outros usuários.

**Vantagens:**
- Reduz o acoplamento entre objetos.
- Facilita a manutenção e escalabilidade da comunicação.

#### 📌 Exemplo 2: Torre de Controle de Aeroporto

Neste cenário, aeronaves se comunicam exclusivamente com uma `TorreControle`, solicitando autorização para decolagem. A torre atua como um mediador, coordenando a operação entre diversas aeronaves.

**Vantagens:**
- Simplifica a lógica de coordenação entre múltiplos objetos.
- Representa bem situações em que há um ponto central de decisão e controle.

📂 Local:  mediator/

---

### 7. Memento

**Intenção:** Capturar e armazenar o estado interno de um objeto para que ele possa ser restaurado posteriormente, sem violar o encapsulamento.

#### 📌 Exemplo 1: Editor de Texto com Desfazer (Undo)

Neste exemplo, o usuário pode digitar textos e desfazer alterações. Cada alteração é armazenada como um `Memento` que guarda o estado anterior do texto, permitindo restaurar versões anteriores.

**Vantagens:**
- Permite desfazer mudanças sem expor a estrutura interna do objeto.
- Ideal para funcionalidades de histórico.

#### 📌 Exemplo 2: Jogo de RPG com Salvamento de Progresso

Neste cenário, o jogador pode lutar, ganhar experiência, perder vida e salvar seu progresso. O progresso é armazenado e pode ser restaurado a qualquer momento, voltando ao estado anterior.

**Vantagens:**
- Útil para jogos, sistemas com checkpoints ou onde há necessidade de desfazer ações.
- Mantém encapsulamento do objeto original.

📂 Local:  memento/

---

### 8. Observer

**Intenção:** Permitir que múltiplos objetos observem e reajam automaticamente sempre que outro objeto (o *sujeito*) muda de estado. Esse padrão promove o baixo acoplamento entre o sujeito e os seus observadores.

#### 📌 Exemplo 1: Sistema de Notícias com Assinantes

Neste cenário, um canal de notícias notifica automaticamente todos os assinantes cadastrados sempre que uma nova notícia é publicada.

**Vantagens:**
- Permite notificações automáticas a múltiplos observadores.
- Reduz o acoplamento entre o objeto observado e os objetos dependentes.

#### 📌 Exemplo 2: Sistema de Monitoramento de Temperatura

Neste exemplo, um sensor de temperatura informa mudanças de estado aos seus observadores, como um ar-condicionado e um painel de controle. Os observadores reagem automaticamente de acordo com a temperatura.

**Vantagens:**
- Ideal para sistemas embarcados e IoT.
- Permite múltiplos tipos de resposta a um mesmo evento de forma desacoplada.

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
