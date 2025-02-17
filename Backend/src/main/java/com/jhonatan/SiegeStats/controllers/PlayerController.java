package com.jhonatan.SiegeStats.controllers;

import com.jhonatan.SiegeStats.services.R6ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final R6ApiService r6ApiService;

    public PlayerController(R6ApiService r6ApiService) {
        this.r6ApiService = r6ApiService;
    }

    @GetMapping("/{nickname}")
    public Mono<String> getPlayerStats(@PathVariable String nickname) {
        return r6ApiService.getPlayerStats(nickname);
    }
}
