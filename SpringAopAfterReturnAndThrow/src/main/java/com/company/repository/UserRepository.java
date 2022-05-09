package com.company.repository;

import com.company.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user){
        if (user == null){
            throw new NullPointerException("User is null!");
        }
        this.users.add(user);
        System.out.println("User added database!");
    }

    public User find(int index){
        User user = this.users.get(index);
        System.out.println("We find user: " + user);

        return user;
    }

    public void delete(User user){
        this.users.remove(user);
        System.out.println("User deleted database!");
    }
}
