package edu.launchcode.initiativetracker.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.launchcode.initiativetracker.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    
}
