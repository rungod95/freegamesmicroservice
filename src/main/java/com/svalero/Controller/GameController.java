package com.svalero.Controller;


import com.svalero.Model.Game;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/filtered-games")
public class GameController {

    private final WebClient webClient;

    public GameController() {
        this.webClient = WebClient.builder()
            .baseUrl("https://www.freetogame.com/api")
            .build();
    }

    @GetMapping
    public Flux<Game> getGamesByPlatform(@RequestParam String platform) {
        return webClient.get()
            .uri(uriBuilder -> uriBuilder.path("/games").queryParam("platform", platform).build())
            .retrieve()
            .bodyToFlux(Game.class);
    }
}
