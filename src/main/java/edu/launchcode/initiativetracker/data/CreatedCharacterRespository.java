package edu.launchcode.initiativetracker.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.launchcode.initiativetracker.model.CreatedCharacter;

@Repository
public interface CreatedCharacterRespository extends CrudRepository<CreatedCharacter, Integer>{
    
}
