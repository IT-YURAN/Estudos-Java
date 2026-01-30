public class ClassePrincipal {

    private int anos;

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public void imprimirAno(){
        System.out.println(getAnos());
    }

    public class ClasseInterna{

        private int anoInterno;

        public int getAnoInterno() {
            return anoInterno;
        }

        public void setAnoInterno(int anoInterno) {
            this.anoInterno = anoInterno;
        }

        public void imprimirInternor(){
            System.out.println(this.getAnoInterno());
        }
        public void OlaInterno(){
            System.out.println("Ola, estou dentro da classe Principal!");
        }
    }

    public static  class ClasseInterna2{

        private String nome;


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void imprimirHey(){
            System.out.println("Sou a segunda classe interna");
        }
        public void imprirNome(){
            System.out.println(this.nome);
        }

    }
}
