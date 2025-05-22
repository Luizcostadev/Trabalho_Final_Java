package model;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> capturedPokemons = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        capturedPokemons.add(pokemon);
    }

    public List<Pokemon> getCapturedPokemons() {
        return capturedPokemons;
    }
}