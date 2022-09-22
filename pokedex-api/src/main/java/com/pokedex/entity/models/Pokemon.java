package com.pokedex.entity.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pokedex.entity.pokemon.MoveBE;
import lombok.Data;

import java.util.List;


@Data
public class Pokemon {

    @JsonProperty("name")
    private String name;

    @JsonProperty("typeName")
    private List<String> typeName;

    @JsonProperty("abbilityNames")
    private List<String>  abbilityNames;

    @JsonProperty("moveNames")
    private List<String> moveNames;

    @JsonProperty("image_url")
    private String imageUrl;
}
