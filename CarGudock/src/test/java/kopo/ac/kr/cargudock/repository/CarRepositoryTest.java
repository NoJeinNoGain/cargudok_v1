package kopo.ac.kr.cargudock.repository;

import jakarta.transaction.Transactional;
import kopo.ac.kr.cargudock.entity.Car;
import kopo.ac.kr.cargudock.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void insertCar(){
        IntStream.rangeClosed(1, 100).forEach(i ->{
//            Member member = Member.builder()
//                    .email("user" + i + "@kopo.ac.kr")
//                    .build();
            if(i<50){
                Car car = Car.builder()
                        .category("Title.." + i)
                        .carName("Content.." + i)
                        .carYear(1990L+i)
                        .carNum("Content.." + i)
                        .mile(20000L+ i)
                        .sunloop(true)
                        .hipass(true)
                        .price(10L + i)
                        .build();
                carRepository.save(car);
            }else{
                Car car = Car.builder()
                        .category("Title.." + i)
                        .carName("Content.." + i)
                        .carYear(1950L+i)
                        .carNum("Content.." + i)
                        .mile(30000L+ i)
                        .sunloop(false)
                        .hipass(false)
                        .price(30L + i)
                        .build();
                carRepository.save(car);
            }

//                    .writer(member) //FK가 설정된 컬럼의 값을 삽입할 때는 반드시 참조하는 Member Entity의 객체 참조값으로 사용해야함



        });
    }
//    @Transactional  //db연동이 끊어지는 현상을 방지하기 위함
//    @Test
//    public void testRead1(){
//        Optional<Board> result = boardRepository.findById(100L); //글번호 100을 찾음
//
//        Board board = result.get();
//        System.out.println(board);
//        System.out.println(board.getWriter());
//    }
//
//    @Test
//    public void testReadWithWriter(){
//        Object result = boardRepository.getBoardWithWriter(50L);
//        Object[] arr = (Object[]) result;
//        System.out.println(Arrays.toString(arr));
//    }
//
//    @Test
//    public void testGetBoardWithReply(){
//        List<Object[]> result = boardRepository.getBoardWithReply(74L);
//
//        for (Object[] arr : result){
//            System.out.println(Arrays.toString(arr));
//        }
//
//    }
//    @Test
//    public void testWithReplyCount(){
//        Pageable pageable = PageRequest.of(0, 10, Sort.by("bno").descending());
//        Page<Object[]> result = boardRepository.getBoardWithReplyCount(pageable);
//        result.get().forEach(row -> {
//            Object[] arr = (Object[]) row;
//            System.out.println(Arrays.toString(arr));
//        });
//
//    }

}
