package kopo.ac.kr.cargudock.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString

public class Car extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String category;

    private String carName;

    private Long carYear;

    private String carNum;

    private Long mile;

    private boolean sunloop;

    private boolean hipass;

    private Long price;


//    @ManyToOne(fetch = FetchType.LAZY)
//    private Member writer; //실제 board테이블에는 writer_email이라는 컬럼이 생성되고 fk(Member테이블의 email컬럼값만 참조하기위해)가 설정된다.



}
