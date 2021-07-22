package com.example.demo2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgreeInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AGREE_INFO_ID")
    private Long id;
    private String perInfo01;
    private String perInfo02;

    @OneToOne
    @JoinColumn(name = "CONSULT_ID")
    @JsonBackReference
    private Consult consult;

}
