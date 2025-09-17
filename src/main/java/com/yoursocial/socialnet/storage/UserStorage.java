package com.yoursocial.socialnet.storage;

import com.yoursocial.socialnet.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserStorage {
    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public Optional<User> findByEmail(String email) {
        return users.stream().filter(u -> u.getEmail().equals(email)).findFirst();
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}
