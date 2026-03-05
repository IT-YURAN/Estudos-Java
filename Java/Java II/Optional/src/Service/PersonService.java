package Service;

import Exceptions.PersonNotFoundException;
import Model.Person;
import Repository.PersonRepository;

public class PersonService {

    private PersonRepository repository=new PersonRepository();

    public Person getPersonByid(Long id) throws PersonNotFoundException {
        return repository.findByid(id)
                .orElseThrow(()-> new PersonNotFoundException("Person not found"));
    }
}
