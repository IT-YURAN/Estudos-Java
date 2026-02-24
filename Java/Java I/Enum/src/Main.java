import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduza o dia da semana");
        String entrada = scanner.nextLine().toUpperCase();

        Dias_da_Semana dia=Dias_da_Semana.valueOf(entrada);
        switch (dia){
            case SEGUNDA,TERCA,QUARTA, QUINTA,SEXTA-> {
                System.out.println("Dia da semana!!!");
            }
            case SABADO, DOMINGO->{
                System.out.println("Final de samana");
            }
        }
        scanner.close();
    }
}
