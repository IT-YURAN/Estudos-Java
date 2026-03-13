import java.util.Objects;

public class ClasseFuncionario {

    private final String nome;
    private final int numeroFuncionario;

    public ClasseFuncionario(String nome,int numeroFuncionario){
        this.nome=nome;
        this.numeroFuncionario=numeroFuncionario;
    }

    @Override
    public String toString() {
        return "ClasseFuncionario{" +
                "nome='" + nome + '\'' +
                ", numeroFuncionario=" + numeroFuncionario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClasseFuncionario that = (ClasseFuncionario) o;
        return numeroFuncionario == that.numeroFuncionario && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroFuncionario);
    }
}
