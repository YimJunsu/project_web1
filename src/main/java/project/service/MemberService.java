package project.service;

import ch.qos.logback.core.joran.conditional.IfAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.dto.MemberDto;
import project.model.entity.MemberEntity;
import project.model.repository.MemberRepository;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public boolean signup(MemberDto memberDto){
        MemberEntity memberEntity = memberDto.toMEntity();
        MemberEntity saveEntity = memberRepository.save(memberEntity);
        if(saveEntity.getMno()>0){
            return true;
        }else {
            return false;
        }
    }
    public boolean login(MemberDto memberDto){
        boolean result = memberRepository.existsByMmailAndMpwd(memberDto.getMmail(), memberDto.getMpwd());
        if(result==true){
            System.out.println("로그인 성공");
            return true;
        }else {
            System.out.println("로그인 실패");
            return false;
        }
    }

}
