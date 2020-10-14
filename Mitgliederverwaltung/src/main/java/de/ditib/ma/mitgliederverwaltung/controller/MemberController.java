package de.ditib.ma.mitgliederverwaltung.controller;

import de.ditib.ma.mitgliederverwaltung.model.Member;
import de.ditib.ma.mitgliederverwaltung.services.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    @ResponseBody
    public List<Member> getAll() {
        return memberService.getAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public Member getMember(@PathVariable Integer id) {
        return memberService.getMember(id);
    }

    @PostMapping("create-or-update")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMemberOrUpdate(member);
    }

    @DeleteMapping("{id}")
    public void createMember(@PathVariable Integer id) {
        memberService.deleteMember(id);
    }
}
