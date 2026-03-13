import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Existem duas formas de inicializar um Array que são: 1- Dando um tamanho ou capacidade ao Array, 2- Colocando os valores dentro e esse será o tamanho
//        String[] ArrayAmigos =new String[4]; Arrays não podem crescer ou diminuir de tamanho
//[0][1][2][3]
        String[] ArrayAmigos2 ={"Flavia", "Melissa","Alfred", "Julio"};

//        ArrayList<String> ArraylistAmigos=new ArrayList<>();
        ArrayList<String> ArraylistAmigos=new ArrayList<>(Arrays.asList("Junior","Lucas", "Marilia","Keyze"));

        System.out.println(ArrayAmigos2[3]);
        System.out.println(ArraylistAmigos.get(3));

        System.out.println(ArrayAmigos2.length);
        System.out.println(ArraylistAmigos.size());

    }
}
