# Palavra-chave Final

A palavra-chave é modificador de não acesso usado para restringir a modificação de entidades, garantindo imutabilidade e segurança <br>

Ela pode ser usada de tres formas: <br>

1.  Classes finais
2. Metodos finais
3. Variaveis Finais 

### Classe final
Quando uma classe é final ela inibe que outras classes sejam filhas dela, nenhuma classe pode herdar dela ou ser **"Filha"** <br>

Exemplo: <br>

    public final class Animal{
    
    }

**A palavra final vem depois do modificador de acesso**

### Metodos finais

A palavra `final` em metodos é usada para fazer com que um metodo em classe mae nao seja alterada por outras classes <br>
Exemplo: <br>
  `  public final void comer(){}`

### Variaveis finais

As variaveis finais são variaveis que so podem ser atribuidas valor uma vez.

