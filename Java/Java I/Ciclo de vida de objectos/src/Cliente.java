public class Cliente {

    private String nome;
    private int ID;
    private String morada;

    public Cliente(String nome, int ID, String morada) {
        this.nome = nome;
        this.ID = ID;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
