package service;

import model.BattleResult;
import model.Pokemon;

import java.util.*;

public class PokemonService {
    private List<Pokemon> pokemons = new ArrayList<>();
    private Random random = new Random();

    public PokemonService() {
        pokemons.add(new Pokemon(1L, "Bulbasaur", "grama", 1));
        pokemons.add(new Pokemon(2L, "Charmander", "fogo", 4));
        pokemons.add(new Pokemon(3L, "Squirtle", "agua", 7));
        pokemons.add(new Pokemon(4L, "Pikachu", "eletrico", 25));
        pokemons.add(new Pokemon(5L, "Geodude", "pedra", 74));
        pokemons.add(new Pokemon(6L, "Oddish", "grama", 43));
        pokemons.add(new Pokemon(7L, "Vulpix", "fogo", 37));
        pokemons.add(new Pokemon(8L, "Poliwag", "agua", 60));
    }

    public List<Pokemon> listAll() {
        return pokemons;
    }

    public BattleResult battle(Long id1, Long id2) {
        Optional<Pokemon> p1Opt = pokemons.stream().filter(p -> p.getId().equals(id1)).findFirst();
        Optional<Pokemon> p2Opt = pokemons.stream().filter(p -> p.getId().equals(id2)).findFirst();

        if (p1Opt.isEmpty() || p2Opt.isEmpty()) {
            return new BattleResult("Um ou ambos os IDs de Pokémon não foram encontrados.");
        }

        Pokemon p1 = p1Opt.get();
        Pokemon p2 = p2Opt.get();

        String vencedor = decideWinner(p1, p2);
        return new BattleResult(p1, p2, vencedor);
    }

    private String decideWinner(Pokemon p1, Pokemon p2) {
        String type1 = p1.getType().toLowerCase();
        String type2 = p2.getType().toLowerCase();

        if (type1.equals(type2)) return random.nextBoolean() ? p1.getName() : p2.getName();

        if (type1.equals("fogo") && type2.equals("grama")) return p1.getName();
        if (type1.equals("grama") && type2.equals("agua")) return p1.getName();
        if (type1.equals("agua") && type2.equals("fogo")) return p1.getName();
        if (type1.equals("eletrico") && type2.equals("agua")) return p1.getName();

        if (type2.equals("fogo") && type1.equals("grama")) return p2.getName();
        if (type2.equals("grama") && type1.equals("agua")) return p2.getName();
        if (type2.equals("agua") && type1.equals("fogo")) return p2.getName();
        if (type2.equals("eletrico") && type1.equals("agua")) return p2.getName();

        return random.nextBoolean() ? p1.getName() : p2.getName();
    }
}
