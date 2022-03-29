package edu.launchcode.initiativetracker.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.launchcode.initiativetracker.model.Encounter;

@Repository
public interface EncounterRepository extends CrudRepository<Encounter, Integer>{
    
}
