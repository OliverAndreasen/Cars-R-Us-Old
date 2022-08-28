package dat3.cars.repository;

import dat3.cars.entity.Member;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @BeforeAll
    public static void setupData(@Autowired MemberRepository memberRepository){
        Member m1 = new Member("aa","aa","aa","aa","aa","aa","aa", 22, true, "aa");

        memberRepository.save(m1);


    }

    @Test
    public void testFindByUsername(){
        Member found = memberRepository.findMembersByUsername("aa");
        assertEquals("aa",found.getUsername() );

    }

}