package project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import project.repository.MemoryMemberRepository;
import project.repository.MemberRepository;
import project.service.MemberService;

@Configuration
public class SpringConfig {
    
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}