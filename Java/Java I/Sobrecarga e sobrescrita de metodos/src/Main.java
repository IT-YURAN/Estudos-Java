public class Main {
    public static void main(String[] args) {

        Cao cao =new Cao();
        cao.falar();

        Calculadora calculadora=new Calculadora();
        System.out.println( calculadora.somar(4,5));
        System.out.println( calculadora.somar(4,5,3));
    }
}
