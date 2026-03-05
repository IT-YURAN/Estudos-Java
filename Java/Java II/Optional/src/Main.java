import Exceptions.PersonNotFoundException;
import Service.PersonService;


public class Main {

    public static void main(String[] args) {

        //Exemplo real simulando banco de dados
        PersonService personService=new PersonService();

        try {
            System.out.println(personService.getPersonByid(5L));
        }
        catch (PersonNotFoundException e ){
            System.out.println(e.getMessage());
        }
    }
}
