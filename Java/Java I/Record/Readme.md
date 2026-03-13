# Record
Um Record, nada mais é que um tipo de classe que armazena dados. Porém, ao invés de possibilitar qualquer alteração a classe é imutável. Também possui os métodos equals, hashCode e toString().<br>

## Algumas boas vantagens a se considerar na utilização de records

* Diminuir escrita de código boilerplate
* Gera os seguintes métodos (toString, Hashcode, e equals)
* Tirar a necessidade de bibliotecas que fazem esse trabalho, como por exemplo, Lombok
* Imutabilidade

## Construtor canónico
Construtor canónico é o construtor gerado automaticamente pelo Record, mesmo se não criamos um directamante, ele gera um.<br>

## Próprio construtor / Construtor compacto
Mesmo sabendo que Java já cria o construtor canónico, você pode ter o seu próprio construtor através da sobrescrita do construtor canónico<br>
A razão para querermos ter os nossos próprios construtores é para fazer algum tipo de validação.

## Restrições
* Records não podem estender outras classes e são finais por padrão.
* Não permitem campos de instância adicionais além dos declarados no cabeçalho. 