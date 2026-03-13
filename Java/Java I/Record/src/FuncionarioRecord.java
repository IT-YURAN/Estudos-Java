public record FuncionarioRecord(String nome, int numeroFuncionario) { //Gera construtor automaticamente

    public FuncionarioRecord(String nome, int numeroFuncionario){ //Próprio construtor/ construtor compacto

        if (numeroFuncionario<0){ //Validação
            throw new IllegalArgumentException("Numero do funcionário nao pode ser negativo");
        }
        this.nome=nome;
        this.numeroFuncionario=numeroFuncionario;
    }

}
