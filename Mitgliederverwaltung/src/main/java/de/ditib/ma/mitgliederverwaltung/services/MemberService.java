package de.ditib.ma.mitgliederverwaltung.services;

import de.ditib.ma.mitgliederverwaltung.model.Member;
import de.ditib.ma.mitgliederverwaltung.repositories.MemberRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    public Member getMember(Integer id) {
        return memberRepository.findById(id);
    }

    public Member createMemberOrUpdate(Member member) {
        return memberRepository.save(member);
    }

    public void deleteMember(Integer id) {
        memberRepository.deleteById(id);
    }

}
