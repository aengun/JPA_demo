package com.example.demo2.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONSULT_ID")
    private Long id;
    private String name;
    private String email01;
    private String phone01;
    private String company;
    private String level;
    private String department;
    private String location;
    private String add;

    @OneToOne(mappedBy = "consult")
    @JsonManagedReference
    private AgreeInfo agreeInfo;

}
