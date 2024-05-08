package com.example.cardapio.food;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Table(name = "foods")
@Entity(name = "foods")
@Setter
@Getter
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food() {
    }

}
