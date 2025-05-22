import controller.PlayerController;
import controller.PokemonController;



public class Main {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        PokemonController pokemonController = new PokemonController();


        String registro = playerController.register("Ash", "pikachu123");
        System.out.println(registro);


        String login = playerController.login("Ash", "pikachu123");
        System.out.println(login);


        System.out.println("Lista de Pokémons:");
        pokemonController.listPokemons().forEach(System.out::println);


        System.out.println("Resultado da batalha:");
        System.out.println(pokemonController.battle(1L, 2L));
    }
}
