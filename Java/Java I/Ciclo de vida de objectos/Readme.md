# Object lifecycle / Ciclo de vida de objectos

## Fazes de ciclo de vida

### 1- Criação de objecto

O ciclo de vida inicia quando um objeto é criado, usando normalmente a palavra-chave `new`.<br>

**Alocação de memória** <br>
Java virtual machine aloca um bloco de memória no heap para as novas instância de objectos.<br>

**Inicialização** <br>
A classe construtor é chamada para inicializar o estado do objecto e colocar os valores inicias para as variáveis. <br>

**Criação de Referência** <br> 
Uma variável de referência é criada, normalmente na pilha, para armazenar o endereço de memória do novo objeto no heap.<br>

## 2- Uso do obecto

Uma vez criado e inicializado, o objecto é considerado em `uso` ou `vivo`, desde que seja alcançável através do programa em execução ou pelo menos através de uma referência forte. <br>

## 3- Inalcançável (Elegível para o garbage colletor)

Um Objecto se torna inalcançável quando já não ha nenhuma referência apontando para ela. <br>
Uma vez que um obejcto se torna inalcançável, ele torna-se elegível para `automatic garbage collection` através do JVM <br>

## Destruição de objectos

O coletor de lixo automático da JVM identifica periodicamente objetos inacessíveis e recupera a memória que eles ocupam. Esse processo não é imediato nem determinístico; o momento exato em que um objeto é coletado depende do algoritmo de coleta de lixo da JVM.
