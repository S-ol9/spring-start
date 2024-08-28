package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,  MemberRepository {
    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}

// springDataJpa가 직접 스프링 빈에 등록하여 구현체 생성
