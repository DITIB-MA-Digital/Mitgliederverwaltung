package de.ditib.ma.mitgliederverwaltung.controller;

import de.ditib.ma.mitgliederverwaltung.model.User;
import de.ditib.ma.mitgliederverwaltung.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping
    @ResponseBody
    public List<User> getAll() {
        return userService.getAll();
    }
    
    @PostMapping("create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
