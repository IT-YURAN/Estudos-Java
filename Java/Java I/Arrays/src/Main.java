public class Main {

    public static void main(String[] args) {

        String[] names =new String[3];

        names[0] = "Alfred"; //
        names[1] = "Julia";
        names[2] = "Sonia";

        for (String name:names){ //Para imprimir todos nomes do Array
            System.out.println("Name: " + name);
        }

        // Array de objectos

        //Os tres objectos estao inicializados na memoria Heap
        Person person1=new Person("Alfred","Mandlate","b1");
        Person person2=new Person("Flavia","alfa","b13");
        Person person3=new Person("Sousa","cossa","parice");

        Person [] people =new Person[3]; //Criacao do Array de objectos

        //Insercao dos objectos no Array
        people[0]=person1;
        people[1]=person2;
        people[2]=person3;

        for (Person person: people){
            person.imprimmir();
        }

        System.out.println(people[0].getFirst_name());

    }
}
