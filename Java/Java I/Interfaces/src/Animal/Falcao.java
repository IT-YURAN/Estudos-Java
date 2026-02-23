package Animal;

import Interface.Predador;

public class Falcao implements Predador {
    @Override
    public void cacar() {
        System.out.println("Falcão esta caçando");
    }
}

