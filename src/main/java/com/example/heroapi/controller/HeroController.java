package com.example.heroapi.controller;

import com.example.heroapi.exception.ResourceNotFoundException;
import com.example.heroapi.model.Hero;
import com.example.heroapi.repository.HeroRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HeroController {
	@Autowired
    HeroRepository heroRepository;

    @GetMapping("/heroes")
    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }
}