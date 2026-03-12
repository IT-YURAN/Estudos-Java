# Generic
Genéricos significa tipos parametrizados. Eles nos permitem escrever código que funciona com diferentes tipos de dados usando uma única classe, interface ou método. <br> Em vez de criar versões separadas para cada tipo, usamos parâmetros de tipo (como <T>) para tornar o código reutilizável e seguro de tipo.

## Por que usar a genérica?

* Antes do Generics, coleções Java como ArrayList ou HashMap podiam armazenar qualquer tipo de objeto, tudo era tratado como um objeto. Teve alguns problemas.
* Se você adicionou uma string a uma lista, o Java não se lembrou do tipo. Você tinha que conjurá-lo manualmente ao recuperar. Se o tipo estava errado, isso causou um erro de tempo de execução.
* Com o Generics, você pode especificar o tipo que a coleção irá conter como ArrayList<String>. Agora, o Java sabe o que esperar e verifica em tempo de compilação, não em tempo de execução.

## Limitações da Genérica
Quando declaramos uma instância de um tipo genérico, o argumento de tipo passado para o parâmetro de tipo deve ser um tipo de referência. Não podemos usar tipos de dados primitivos como int, char
## Tipos de Java Genéricos
**Classe Genérica** <br>
Uma classe genérica é uma classe que pode operar em objetos de diferentes tipos usando um parâmetro de tipo. Como C++, usamos <> para especificar tipos de parâmetros na criação de classes genéricas. Para criar objetos de uma classe genérica, usamos a seguinte sintaxe: <br>
`BaseType <Type> obj = new BaseType <Type>()` <br>
**Nota:** No tipo de parâmetro, não podemos usar primitivas como "int", "char" ou "double". Use aulas de wrapper como Inteiro, Caráter, etc.

## Método Genérico
Também podemos escrever métodos genéricos que podem ser chamados com diferentes tipos de argumentos com base no tipo de argumentos passados para o método genérico. O compilador lida com cada método.

## Tipo Parâmetro Nomear Convenções
* T: Tipo
* E: Elemento
* K: Chave
* N: Número
* V: Valor
