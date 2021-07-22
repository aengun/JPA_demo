package com.example.demo2.service;

import com.example.demo2.domain.Consult;
import com.example.demo2.repository.ConsultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultService {

    @Autowired
    ConsultRepository consultRepository;

    public Consult createConsult(Consult consult){

        Consult created = consultRepository.save(consult);

        System.out.println("===================================");
        System.out.println(consult.getAgreeInfo().getPerInfo01());;



        return created;

    }
}
