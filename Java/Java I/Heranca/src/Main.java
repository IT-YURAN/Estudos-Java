import Entity.*;
public class Main {

    public static void main(String[] args) {

         Carro carro=new Carro();
         Bicicleta bicicleta=new Bicicleta();

         carro.mover();
         bicicleta.mover();

//        System.out.println(carro.getVelocidade());
//        System.out.println(bicicleta.getVelocidade());
        System.out.println(carro.getNumeroPorta());
        System.out.println(bicicleta.getNumeroPedais());

    }
}
