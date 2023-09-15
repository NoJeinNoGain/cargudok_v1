package kopo.ac.kr.cargudock.dto;

import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private Long bno;

    private String category;

    private String carName;

    private Long carYear;

    private String carNum;

    private Long mile;

    private boolean sunloop;

    private boolean hipass;

    private Long price;




}
