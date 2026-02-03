package Entity;

public class Bicicleta extends Veiculo{

   private int rodas= 2;
    private int numeroPedais= 2;

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getNumeroPedais() {
        return numeroPedais;
    }

    public void setNumeroPedais(int numeroPedais) {
        this.numeroPedais = numeroPedais;
    }
}
