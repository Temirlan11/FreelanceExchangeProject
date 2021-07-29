package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_winners")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Winners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "finished")
    private boolean finished;

    @ManyToOne(fetch = FetchType.EAGER)
    private Users user;

    @OneToOne(fetch = FetchType.LAZY)
    private Bid bid;

    @OneToOne(fetch = FetchType.LAZY)
    private Advert advert;
}
