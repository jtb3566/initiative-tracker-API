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

    @PostMapping(value = "/getAccountByEmail", consumes = "application/x-www-form-urlencoded")
    public ResponseEntity<User> returnUser (@RequestBody String email) throws URISyntaxException {
        String formattedEmail = email.replaceAll("%40", "@").replaceAll("=", "");
        User account = userRepository.findByEmail(formattedEmail);
        return ResponseEntity.ok().body(account);
    }
}
