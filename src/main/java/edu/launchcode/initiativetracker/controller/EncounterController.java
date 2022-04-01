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
    public void deleteEncounter (@RequestBody Encounter encounter) {
        encounterRepository.delete(encounter);
    }
}
