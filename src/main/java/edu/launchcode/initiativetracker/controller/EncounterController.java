package edu.launchcode.initiativetracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.launchcode.initiativetracker.data.EncounterRepository;
import edu.launchcode.initiativetracker.model.Encounter;

@CrossOrigin
@RestController
@RequestMapping("/api/encounter")
public class EncounterController {
    @Autowired
    private EncounterRepository encounterRepository;
    
    @PostMapping(value="/create", consumes="application/json")
    public ResponseEntity<Encounter> createEncounter(@RequestBody Encounter encounter) {
        Encounter newEncounter = encounterRepository.save(encounter);
        return ResponseEntity.ok().body(newEncounter);
    }

    @GetMapping(value="/getAll")
    public ResponseEntity<List<Encounter>> returnAllEncounters () {
        List<Encounter> encounters = new ArrayList<>();
        encounterRepository.findAll().forEach(encounters::add);
        return ResponseEntity.ok().body(encounters);            
    }

    @PostMapping(value="/delete", consumes="application/json")
    public ResponseEntity<Boolean> deleteEncounter (@RequestBody Encounter encounter) {
        encounterRepository.delete(encounter);
        Boolean deleted = !(encounterRepository.existsById(encounter.getId()));
        return ResponseEntity.ok().body(deleted);
    }

    @PostMapping(value="/addCharacter", consumes="application/json")
    public ResponseEntity<Encounter> addCharacter (@RequestBody Encounter encounter) {
        Encounter updatedEncounter = encounterRepository.save(encounter);
        return ResponseEntity.ok().body(updatedEncounter);
    }

    @PostMapping(value="/deleteCharacter", consumes="application/json")
    public ResponseEntity<Encounter> deleteCharacter (@RequestBody Encounter encounter) {
        Encounter updatedEncounter = encounterRepository.save(encounter);
        return ResponseEntity.ok().body(updatedEncounter);
    }

    @PostMapping(value="/addMonster", consumes="application/json")
    public ResponseEntity<Encounter> addMonster (@RequestBody Encounter encounter) {
        Encounter updatedEncounter = encounterRepository.save(encounter);
        return ResponseEntity.ok().body(updatedEncounter);
    }

    @PostMapping(value="/deleteMonster", consumes="application/json")
    public ResponseEntity<Encounter> deleteMonster (@RequestBody Encounter encounter) {
        Encounter updatedEncounter = encounterRepository.save(encounter);
        return ResponseEntity.ok().body(updatedEncounter);
    }

}
