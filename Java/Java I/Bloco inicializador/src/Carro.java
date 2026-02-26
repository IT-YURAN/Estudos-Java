public class Carro {

    private String marca;
    private int Id;

    public Carro() {
        System.out.println("Imprimindo através do construtor padrão");
    }

    public Carro(String marca) {
        this.marca = marca;
        Id++;
        System.out.println("Imprimindo através do construtor parametrizado");
    }

    {
        System.out.println("Exibindo através do bloco inicializador");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
