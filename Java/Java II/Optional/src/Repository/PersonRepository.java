package Repository;

import Model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    private List<Person> database =new ArrayList<>();

    public PersonRepository() {
        database.add(new Person(1L,"Alfred","Patrice"));
        database.add(new Person(2L,"Melissa","Damaso"));
        database.add(new Person(3L,"Flavia","Gimok"));
        database.add(new Person(4L,"Enzo","T3"));
    }

    public Optional<Person> findByid(Long id){
        for (Person person: database){
            if (person.getId()==id){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
