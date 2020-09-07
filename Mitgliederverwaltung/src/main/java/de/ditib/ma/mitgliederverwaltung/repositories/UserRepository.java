package de.ditib.ma.mitgliederverwaltung.repositories;

import de.ditib.ma.mitgliederverwaltung.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Override
    List<User> findAll();
    
}
