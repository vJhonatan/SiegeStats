package com.jhonatan.SiegeStats.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class R6ApiService {

    private static final Logger logger = LoggerFactory.getLogger(R6ApiService.class);
    private final WebClient webClient;

    public R6ApiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://r6.apitab.com/api").build();
    }

    public Mono<String> getPlayerStats(String nickname) {
        logger.info("Buscando estatísticas para o jogador: {}", nickname);
        return webClient.get()
                .uri("/player/{nickname}", nickname)
                .retrieve()
                .bodyToMono(String.class)
                .doOnSuccess(response -> logger.info("Resposta recebida: {}", response))
                .doOnError(error -> logger.error("Erro ao buscar estatísticas do jogador", error));
    }
}