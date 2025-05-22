package service;

import model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    private List<Player> players = new ArrayList<>();

    public boolean register(String username, String password) {
        // Verifica se usuário já existe
        boolean exists = players.stream()
                .anyMatch(p -> p.getUsername().equals(username));
        if (exists) return false;

        players.add(new Player(username, password));
        return true;
    }

    public boolean login(String username, String password) {
        return players.stream()
                .anyMatch(p -> p.getUsername().equals(username) && p.getPassword().equals(password));
    }
}
