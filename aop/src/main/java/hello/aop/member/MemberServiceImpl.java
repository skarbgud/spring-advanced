package hello.aop.member;

import hello.aop.member.anotation.ClassApp;
import hello.aop.member.anotation.MethodAop;
import org.springframework.stereotype.Component;

@ClassApp
@Component
public class MemberServiceImpl implements MemberService {

    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }
}