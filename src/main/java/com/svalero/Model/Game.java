package com.svalero.Model;

import lombok.Data;
import lombok.Getter;

@Getter
public class Game {

    private int id;
    private String title;
    private String thumbnail;
    private String short_description;
    private String game_url;
    private String genre;
    private String platform;
    private String publisher;
    private String developer;
    private String release_date;

    // Getters y setters

}

