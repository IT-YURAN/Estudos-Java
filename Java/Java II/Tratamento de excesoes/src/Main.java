import Entity.User;
import Service.UserService;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public int dividir(int num1, int num2){
        return num1/num2;
    }

    public void  verificarIdadde(int idade){
        if (idade<18){
            throw new ArithmeticException("Idade deve ser maior que 18"); //
        }
    }

    public void lerFicheiro(String nomeFicheiro) throws IOException { //De clara que esse metodo pode lancar um IOException

        FileReader fileReader=new FileReader(nomeFicheiro);
    }

    public static void main(String[] args) {

        User[] users =new User[3]; //Array de objects

        Main main=new Main();

        try { //Tenta executar codigo que pode lancar uma excesao
//            System.out.println(main.dividir(4,0));
//            main.verificarIdadde(17);
        }
        catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        finally { //Tudo dentro desse bloco é sempre executado

        }

        try {
            main.lerFicheiro("Data.txt");
        }
        catch (IOException e){
            System.out.println("File not found"+ e.getMessage());
        }
        finally {
            System.out.println("End of process");
        }

        UserService userService =new UserService();

        userService.createUser("alfre","jajaj");
        userService.createUser("Flavia","");
        userService.createUser("Melissa","jlald");


    }
}
