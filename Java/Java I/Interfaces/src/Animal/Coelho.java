package Animal;

import Interface.Presa;

public class Coelho implements Presa {

    @Override
    public void fugir() {
        System.out.println("Coelho fugindo");
    }
}
