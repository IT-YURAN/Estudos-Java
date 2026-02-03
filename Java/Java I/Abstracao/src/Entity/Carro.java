package Entity;

public class Carro extends Veiculo{

    private String tipo_Combustivel;

    public String getTipo_Combustivel() {
        return tipo_Combustivel;
    }

    public void setTipo_Combustivel(String tipo_Combustivel) {
        this.tipo_Combustivel = tipo_Combustivel;
    }

    @Override
    public void andar() {
        System.out.println("Acelerando");
    }
}
