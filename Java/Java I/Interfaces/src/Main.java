import Animal.*;
public class Main {

    public static void main(String[] args) {

        Coelho coelho=new Coelho();
        coelho.fugir();

        Falcao falcao=new Falcao();
        falcao.cacar();

        Peixe peixe=new Peixe();
        peixe.cacar();
        peixe.fugir();

    }
}
