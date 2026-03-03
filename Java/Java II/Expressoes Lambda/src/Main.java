public class Main {

    public static void main(String[] args) {

        HelloFuncionalInterface funcionalInterface = ()-> System.out.println("Ola Lambda");
        funcionalInterface.imprimir();


        String name ="Alfred";
        char simbolo = '!';

        MinhaInterface minhaInterface =(n,s) -> {
            System.out.println("Aprendendo Lambda!");
            System.out.println("É um bom dia " +n +s);
        };

        minhaInterface.message(name,simbolo);


    }
}
