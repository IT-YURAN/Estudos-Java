import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> FuncionariosId=new HashMap<>();

        FuncionariosId.put("Alfred",1 );
        FuncionariosId.put("Flavia",2);
        FuncionariosId.put("Yuran",3);
        FuncionariosId.put("Duda",4);
        System.out.println(FuncionariosId);
        System.out.println(FuncionariosId.get("Alfred"));

    }
}
