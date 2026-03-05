# Injeção de dependência/ Dependecy injection

Injeção de dependência (DI) é um padrão de design usado na programação orientada a objetos, onde um objeto recebe suas
dependências necessárias de uma fonte externa, em vez de criá-las. <br>
sso ajuda a gerenciar como os objetos são construídos e como eles obtêm os recursos de que precisam. Ao separar a criação
de dependência do uso, o DI melhora a flexibilidade do código. Isso resulta em sistemas mais fáceis de modificar, testar e manter. <br>

* Reduz o acoplamento apertado entre as classes
* Melhora a reutilização e flexibilidade de código
* Facilita o teste de unidade, permitindo dependências simuladas
* Melhora a capacidade de manutenção e escalabilidade do sistema

**Em termos mais simples, o DI permite que você "injete" as coisas que uma classe precisa (suas dependências) do lado de 
fora, em vez de deixar a classe criá-las ou gerenciá-las sozinha.**

## Tipos de injeção de dependência

Existem principalmente três tipos de injeção de dependência, que são Injeção de Construtor, Injeção de Setter e Injeção de Interface. <br>

## Injeção de Construtor
Com a injeção de construtor, as dependências são fornecidas a uma classe através de seu construtor quando o objeto é criado.<br>
Esta é a forma mais comum de DI porque torna as dependências claras, obrigatórias e imutáveis depois que o objeto é construído.

## Injeção do Setter
A injeção de setter envolve o fornecimento da dependência através de um método de setter após a criação do objeto. <br>
Esta abordagem é mais flexível do que a injeção do construtor, pois permite que as dependências sejam definidas ou alteradas após a criação do objeto.

## Injeção de interface
A injeção de interface requer que a classe implemente uma interface que forneça um método para receber a dependência. <br>
Isso é menos comumente usado em Java, mas permite mais flexibilidade e dissociação.