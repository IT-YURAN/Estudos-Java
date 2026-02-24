public class Main {

    public static void main(String[] args) {

        Cliente cliente=new Cliente("Alvaro", 1,"Patrice"); //Criação e inicialização do objecto

        System.out.println(cliente.getNome()); //Uso do objecto

        cliente=null; //Elegível para o GC

    }
}
