package kopo.ac.kr.cargudock.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car/")
@Log4j2
@RequiredArgsConstructor

public class CarController {
    @GetMapping("/list")
    public void list(){
        log.info("list ............");

    }




}
