# Optional
Optional é uma caixinha que pode ou não ter algo dentro.
## Por que ele existe?
Porque em Java algo pode ser null e Null é perigoso. <br>
`Person person = null;
person.getName(); //  NullPointerException`

O Optional foi criado para evitar esse tipo de erro. Ele força você a verificar antes se existe algo dentro.

## Métodos do Optional

**Optional.of:** É usado para criar uma caixa obrigatoriamente com valor. <br>
`Optional<String> nome = Optional.of("João");` <br> Se passar null, dá erro (NullPointerException).

**Optional.ofNullable(valor):** Cria a caixa e aceita null. <br>
`Optional<String> nome = Optional.ofNullable(null);` <br> Se for null → vira Optional.empty().

**Optional.empty():** Cria uma caixa vazia. <br>
`Optional<String> nome = Optional.empty();`

## Métodos para verificar

**isPresent()** Retorna true se tiver valor. <br> `if(optional.isPresent()){
System.out.println("Tem valor!");
}` <br>

**isEmpty() (Java 11+)** Retorna true se estiver vazio. <br> `if(optional.isEmpty()){
System.out.println("Está vazio!");
}`

## Métodos para pegar o valor
**get()** <br>
`String nome = optional.get();`
Perigoso!
Se estiver vazio → lança erro.
Usar só quando tiver certeza que existe valor. <br>

**orElse(valorPadrão)** Se tiver valor → retorna ele
Se não → retorna o valor padrão
`String nome = optional.orElse("Desconhecido");` <br>
**orElseGet(Supplier)** Parecido com orElse, mas só executa se estiver vazio.` String nome = optional.orElseGet(() -> gerarNome());`
Diferença importante: <br>
* orElse() executa o valor padrão SEMPRE 
* orElseGet() só executa se precisar

**orElseThrow()** Lança exceção se estiver vazio. `String nome = optional.orElseThrow();`

# Métodos para transformar valor

**map()**
Transforma o valor se existir. `Optional<String> nome = Optional.of("João");`

`Optional<Integer> tamanho = nome.map(String::length);`

**filter()** Filtra o valor.
`Optional<String> nome = Optional.of("João");
Optional<String> resultado = nome.filter(n -> n.startsWith("J"));`

# Executar ação

**ifPresent()** Executa algo se tiver valor. `optional.ifPresent(valor ->
System.out.println(valor)`
);

## Resumo

| Método          | O que faz                  |
| --------------- | -------------------------- |
| `of()`          | Cria com valor obrigatório |
| `ofNullable()`  | Cria aceitando null        |
| `empty()`       | Cria vazio                 |
| `isPresent()`   | Verifica se tem valor      |
| `get()`         | Pega valor (perigoso)      |
| `orElse()`      | Valor padrão               |
| `orElseGet()`   | Valor padrão sob demanda   |
| `orElseThrow()` | Lança erro                 |
| `map()`         | Transforma valor           |
| `flatMap()`     | Evita Optional aninhado    |
| `filter()`      | Filtra valor               |
| `ifPresent()`   | Executa ação               |

Dica de programador experiente

Use Optional principalmente:

✔ Como retorno de método