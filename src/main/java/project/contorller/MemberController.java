package project.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.model.dto.MemberDto;
import project.service.MemberService;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("/member/signup")
    public boolean signup(@RequestBody MemberDto memberDto){
        return memberService.signup(memberDto);
    }
    @PostMapping("/member/login")
    public boolean login(@RequestBody MemberDto memberDto){
        return memberService.login(memberDto);
    }
}
