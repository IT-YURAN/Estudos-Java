# Map & HashMap
Em Java, a Interface de Mapa faz parte do pacote `java.util `e representa uma coleção de pares chave-valor, onde as Chaves devem ser exclusivas, mas os valores podem ser duplicados.
* Ele fornece operações eficientes de recuperação, inserção e exclusão com base em chaves.
* `HashMap` e `LinkedHashMap` permitem uma chave nula, e `TreeMap` NÃO permite chaves nulas (se a ordenação natural for usada). <br>
Map é uma interface `public interface Map<K, V>`, e pode ser implementada pelas seguintes classes: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`.  <br>
  K -> Tipo de chaves mantidas pelo mapa <br>
  V -> Tipo de valores mapeados <br>
**HashMap:** Armazena pares de chave-valor usando hash para acesso rápido, inserção e exclusão.<br>
**LinkedHashMap:** Semelhante ao HashMap, mas mantém a ordem de inserção de pares chave-valor. <br>
**TreeMap:** armazena pares de valor-chave em ordem classificada usando pedido natural ou um comparador personalizado. <br>
**Hashtable:** ma implementação de mapa sincronizada que não permite chaves ou valores nulos.<br>

**Maps** Não garante uma certa ordem, eles servem para armazenar esses pares de chave-valor.

