public class Teste <T,U>{ // <T> é chamado de parâmetro de tipo, também podemos passar vários parâmetros de tipo em classes genéricas.
    //Para que  nem todo tipo possa ser atribuído ao T podemos extender ou herdar de alguma classe(T extends String) e é chamado de Generic limitado
    T object;
    U object2;

    public Teste(T object, U object2) {
        this.object = object;
        this.object2 = object2;
    }

    public void print(){
        System.out.print(object);
        System.out.println(object2);
    }

    @Override
    public String toString() {
        return "Teste{" +
                "object=" + object +
                ", object2=" + object2 +
                '}';
    }
}
