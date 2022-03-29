package edu.launchcode.initiativetracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.launchcode.initiativetracker.data.CreatedCharacterRespository;
import edu.launchcode.initiativetracker.model.CreatedCharacter;

@CrossOrigin
@RestController
@RequestMapping("/api/createdCharacter")
public class CreatedCharacterController {  
    @Autowired
    private CreatedCharacterRespository createdCharacterRespository;

    @PostMapping(value = "/create", consumes = "application/json")
    public ResponseEntity<CreatedCharacter> createCharacter(@RequestBody CreatedCharacter createdCharacter) {
        CreatedCharacter newCharacter = createdCharacterRespository.save(createdCharacter);
        return ResponseEntity.ok().body(newCharacter);
    }
}