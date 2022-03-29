package edu.launchcode.initiativetracker.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.launchcode.initiativetracker.data.UserRepository;
import edu.launchcode.initiativetracker.model.User;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CreateAccountController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/createAccount", consumes = "application/json")
    public ResponseEntity<User> createUser (@RequestBody User user) throws URISyntaxException {
        User newUser = userRepository.save(user);
        return ResponseEntity.ok().body(newUser);
    }

    @PostMapping(value = "/getAccountByEmail")
    public ResponseEntity<User> returnUser (@RequestBody User user) throws URISyntaxException {
        System.out.println(user.getEmail());
        User account = userRepository.findByEmail(user.getEmail());
        return ResponseEntity.ok().body(account);
    }
}
