package kopo.ac.kr.cargudock.repository;

import kopo.ac.kr.cargudock.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    //Lazy 방식에서는 Join이 필요할 때 JPQL을 사용해서 Join에 필요한 sql문을 작성해야함.
//    @Query("select b, w " +
//            "from Car b " +
//            "left join b.writer w " +
//            "where b.bno = :bno ")
//    Object getBoardWithWriter(@Param("bno") Long bno); //변수명 사용불가로 @Param의 값이 위에 :bno에 들어감

    //목록화면에 사용할 데이터형의 결과 집합을 얻을수 있는 JPQL
//    @Query("select b, r from Car b left join Reply r ON r.board = b where b.bno=:bno")
//    List<Object[]> getBoardWithReply(@Param("bno") Long bno);


//    //목록화면에 사용된 데이터행의 결과 + 댓글의 개수
//    @Query(value = "select b, w, count(r) from Board b" +
//            " left join b.writer w " +
//            "left join Reply r ON r.board = b " +
//            "group by b",
//            countQuery = "select count(b) from Board b")
//    Page<Object[]> getBoardWithReplyCount(Pageable pageable);
}
