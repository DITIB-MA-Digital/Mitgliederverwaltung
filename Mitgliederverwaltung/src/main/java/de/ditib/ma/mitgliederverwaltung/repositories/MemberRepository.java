package de.ditib.ma.mitgliederverwaltung.repositories;

import de.ditib.ma.mitgliederverwaltung.model.Member;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    @Override
    List<Member> findAll();

    @Override
    Member findById(Integer id);

}
