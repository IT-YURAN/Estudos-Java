# Classes alinhadas/ Inner classes

Uma classe alinhada é simplesmente uma classe que esta dentro de uma classe.<br>

Para criar temos a seguinte estrutura.<br>

`public class A{

public  class B{

    }
}`

Assim temos a classe B como a **inner classe** <br>
As `inner classes` podem ter tudo que as classe principais podem ter. <br>

Assim sendo a classe B pertence à classe A e por essa razão ao criar o objecto da classe B temos que ter objecto da classe A.<br>
Já que a classe não é estática temos que usar a seguinte sintax: <br>

`A.B + referencia= a.new B();` <br>
a-> Simboliza o objecto da classe A. <br>

Quando a classe interna for estatica nao precisamos do objecto a classe principal, usamos a seguinte sintax:<br>

`A.B referencia =new A.B();`