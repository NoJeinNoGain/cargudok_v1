package kopo.ac.kr.cargudock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CarGudockApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarGudockApplication.class, args);
    }

}
