package controller;

import model.Pokemon;
import model.BattleResult;
import service.PokemonService;

import java.util.List;

public class PokemonController {

    private PokemonService pokemonService = new PokemonService();

    public List<Pokemon> listPokemons() {
        return pokemonService.listAll();
    }

    public String battle(Long id1, Long id2) {
        BattleResult result = pokemonService.battle(id1, id2);
        return result.toString();
    }
}
