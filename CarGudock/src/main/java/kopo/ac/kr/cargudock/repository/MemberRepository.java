package kopo.ac.kr.cargudock.repository;

import kopo.ac.kr.cargudock.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, String> {

}
