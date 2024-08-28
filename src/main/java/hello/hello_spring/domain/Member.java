package hello.hello_spring.domain;

import jakarta.persistence.*;

@Entity // jpa 가 관리
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // @Column(name= "name") => 데이터베이스랑 매핑, 이름이 동일할 경우 굳이 선언 필요 X
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
