package Service;

import Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> userList =new ArrayList<>();

    public User createUser(String name, String passwor){
        if (name == null || passwor.isBlank()){
           throw new IllegalArgumentException("");
        }
        User user=new User(name,passwor);
        userList.add(user);
        System.out.println("User created");
        return user;
    }
    public void listUsers(){
        for (User user: userList){
            System.out.println(user);
        }
    }
}
