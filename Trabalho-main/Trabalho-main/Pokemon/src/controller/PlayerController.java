package controller;

import model.Player;
import service.PlayerService;

import java.util.Scanner;

public class PlayerController {

    private PlayerService playerService = new PlayerService();


    public String register(String username, String password) {
        boolean success = playerService.register(username, password);
        return success ? "Registro concluído" : "Nome de usuário já existe";
    }

    public String login(String username, String password) {
        boolean success = playerService.login(username, password);
        return success ? "Login concluído" : "Credenciais inválidas";
    }
}
