package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    public FoodRepository getRepository() {
        return repository;
    }

    public void setRepository(FoodRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;

    }
}
