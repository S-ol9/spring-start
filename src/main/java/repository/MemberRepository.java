package repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional => 값이 없으면 null로 처리할 수 있게끔 optional로 감싼다.
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
