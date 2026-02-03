# Abstracao


### Classes abstratas

Classes abstratas não podem ser instanciadas, ou seja, elas nao podem ser usadas para criar objectos. <br>
As classes abstratas não podem gerar objectos, mas outras classes podem herdar dessas classes. <br>

**Porque criar uma classe abstrata?** <br>
Criamos classes abstratas quando não faz sentido que aquela classe tenha objectos, conforme demostrado na classe `Veiculo` no **pacote Entity** <br>
As classes abstratas podem ter metodos abstratos assim como os metodos concreto.


### Metodos abstratos

Um metodo abstrato é um metodo que não tem corpo. Esses metodos devem estar numa classe ou em uma ‘interface’. <br>
Toda a classe que for a herdar de uma classe abstrata deve ter obrigatoriamente a sua propria implementacao do metodo. <br>
