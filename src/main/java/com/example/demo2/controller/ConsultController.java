package com.example.demo2.controller;

import com.example.demo2.domain.Consult;
import com.example.demo2.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsultController {

    @Autowired
    ConsultService consultService;

    @PostMapping("/consult")
    public Consult createConsult(@RequestBody Consult consult) {
        Consult created = consultService.createConsult(consult);
        return created;
    }

}
