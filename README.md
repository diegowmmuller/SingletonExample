# Singleton Example em Java

Este projeto demonstra a implementação do **padrão de projeto Singleton** em Java.  
O Singleton garante que **apenas uma instância** de uma classe seja criada durante a execução do programa.

---

## Estrutura do Projeto

br.study/  
├── Main.java  
└── SingletonExample.java

- **SingletonExample**: Classe que implementa o padrão Singleton.
- **Main**: Classe principal que demonstra o uso do Singleton.

---

## Explicação do Código

A classe `SingletonExample` possui:

- Um atributo `private static` que mantém a única instância da classe.
- Um **construtor privado** para impedir a criação de objetos fora da própria classe.
- Um método `getInstance()` **síncrono**, responsável por criar a instância caso ainda não exista ou retorná-la.

A classe `Main` cria duas variáveis (`s1` e `s2`) que recebem a instância do Singleton. A execução prova que **apenas uma instância é criada**, mesmo com múltiplas chamadas a `getInstance()`.

---

## Saída Esperada

Instancia unica criada  
br.study.SingletonExample@2a84aee7  
br.study.SingletonExample@2a84aee7

- A mensagem `Instancia unica criada` aparece **uma única vez**.
- Os dois `System.out.println` exibem o **mesmo endereço de memória**, confirmando que `s1` e `s2` apontam para a mesma instância.

---

## Benefícios do Singleton

- Garante **uma única instância** para toda a aplicação.
- Útil para recursos **compartilhados**, como conexões com banco de dados, loggers e configurações globais.
- Implementação **thread-safe** com o uso de `synchronized`.
