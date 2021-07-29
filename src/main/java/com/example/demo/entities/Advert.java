package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_adverts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "desrciption")
    private String desrciption;

    @Column(name = "company")
    private String company;

    @Column(name = "price")
    private int price;

    @Column(name = "img")
    private String img;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

}
