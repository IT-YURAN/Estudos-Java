import Entity.Carro;
import Entity.Bicicleta;
public class Main {

    public static void main(String[] args) {


        Carro carro=new Carro();
        carro.andar();
        carro.setTipo_Combustivel("Gasolina");
        System.out.println(carro.getTipo_Combustivel());

        Bicicleta bicicleta=new Bicicleta();
        bicicleta.andar();
    }
}
