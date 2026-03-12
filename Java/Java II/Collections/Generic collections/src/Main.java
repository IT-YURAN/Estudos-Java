public class Main {
    public static void main(String[] args) {

        Teste<Integer,String> teste=new Teste<>(20, " Happy"); //Temos que especificar o tipo para dizer ao java que tipo estamos a usar!
        teste.print();
        //Agora podemos criar 'testes' que podem imprimir não só números inteiros, mas também outros tipos como String

        Teste<String,Character> stringTeste=new Teste<>("Generic",'!');
        stringTeste.print();

        shout("Ola");
        shout(52);
        shout(new Teste<String, Integer>("Ola",20));

    }

    public static <T> void shout(T thing){ //Esse método pode receber todo tipo de objectos
        System.out.println(thing+ " !!!!");
    }
}
