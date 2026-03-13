import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Set nao aceita dados duplicados
        Set<String> email=new HashSet<>();

        email.add("Tueka34@gmail.com");
        email.add("Tueka34@gmail.com");
        email.add("Melmaia33@gmail.com");
        email.add("Alfredkarma@gmail.com");
//        System.out.println(email);
//        System.out.println(email.size());
//        email.remove("Tueka34@gmail.com");
//        System.out.println(email);
//        System.out.println(email.size());
        email.forEach(System.out::println);




    }
}
