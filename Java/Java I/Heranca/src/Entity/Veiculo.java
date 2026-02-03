package Entity;

public class Veiculo {

    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void mover(){
        System.out.println("Esse veiculo esta se movendo ");
    }

    public void parar(){
        System.out.println("Este Veiculo esta parado!");
    }
}
