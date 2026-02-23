package Animal;

import Interface.Predador;
import Interface.Presa;

public class Peixe implements Presa, Predador { //Implementando as duas interfaces
    @Override
    public void cacar() {
        System.out.println("O peixe esta caçando");
    }

    @Override
    public void fugir() {
        System.out.println("O peixe esta fugindo");
    }
}
