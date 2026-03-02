#  Tratamento de exceções /Exception handling

O manuseio de exceção é um mecanismo para lidar com erros de tempo de execução, permitindo que o fluxo normal de um programa 
continue. Exceções são eventos que ocorrem durante a execução do programa que interrompem o fluxo normal de instruções.

## Exemplo básico de try-catch

* O bloco try contém código que pode lançar uma exceção
* O bloco de capturas lida com a exceção se ocorrer.

## Bloco finally
O bloco `finally`sempre executado se uma exceção é lançada ou não. O `finally` é usado para fechar recursos como conexões
db, abrir arquivos e conexões de rede, É usado após um bloco try-catch para executar código que deve ser executado. 

## Palavra-chave Throw e throws

### Throw
Usado para explicitamente uma unica excesao. Nós usamos throw quando algo dá errado (ou “não deveria acontecer”) e 
queremos parar o fluxo normal e o controle das mãos para o manuseio de exceção. 

## Throws

Usado para declarar que um método pode laçar várias exçoes, informando ao chamador para lidar com elas.É usado principalmente com exceções verificadas (explicado abaixo). Se um método chama outro método que lança uma exceção verificada, e ele não o pega, ele deve declarar essa exceção em sua throws cláusula

## Hierarquia de Exceção Java

Em Java, todas as exceções e erros são subclasses da classe Throwable. Tem dois ramos principais

1. Exceção.
2. Erro

Como demostra a imagem abaixo: <br>
https://media.geeksforgeeks.org/wp-content/uploads/20251008124212466472/object.webp

## Exceção Definida pelo Usuário
Às vezes, as exceções incorporadas em Java não são capazes de descrever uma determinada situação. Nesses casos, os usuários também podem criar exceções, que são chamadas de "Exceções definidas pelo usuário".

## Métodos para imprimir as informações de exceção

**printStrackTrace:** Imprime o traço de pilha completa da exceção, incluindo o nome, a mensagem e a localização do erro. <br>
**toString:** Imprime informações de exceção no formato do Nome da exceção.<br>
**getMessage:** Imprime a descrição da exceção



