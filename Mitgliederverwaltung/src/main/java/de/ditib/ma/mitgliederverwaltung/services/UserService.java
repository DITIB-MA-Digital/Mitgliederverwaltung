package de.ditib.ma.mitgliederverwaltung.services;

import de.ditib.ma.mitgliederverwaltung.model.User;
import de.ditib.ma.mitgliederverwaltung.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User createUserOrUpdate(User user) {
        return userRepository.save(user);
    }

}
