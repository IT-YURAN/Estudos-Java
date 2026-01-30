public class Main {

    public static void main(String[] args) {

        ClassePrincipal classePrincipal=new ClassePrincipal();
        classePrincipal.setAnos(20);
        classePrincipal.imprimirAno();

        ClassePrincipal.ClasseInterna classeInterna =classePrincipal.new ClasseInterna(); //Classe não estática precisa do objecto
        classeInterna.setAnoInterno(19);
        System.out.println( classeInterna.getAnoInterno());

        ClassePrincipal.ClasseInterna2 classeInterna2=new ClassePrincipal.ClasseInterna2(); //Classe  estática!

        classeInterna2.setNome("Albert");
        classeInterna2.imprirNome();


    }
}
