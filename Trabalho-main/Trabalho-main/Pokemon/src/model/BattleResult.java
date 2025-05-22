package model;

public class BattleResult {
    private Pokemon p1;
    private Pokemon p2;
    private String winner;
    private String message; // pra casos de erro ou aviso

    public BattleResult(String message) {
        this.message = message;
    }

    public BattleResult(Pokemon p1, Pokemon p2, String winner) {
        this.p1 = p1;
        this.p2 = p2;
        this.winner = winner;
    }



    @Override
    public String toString() {
        if (message != null && !message.isEmpty()) {
            return message;
        }
        return "Batalha entre " + p1.getName() + " e " + p2.getName() + ". Vencedor: " + winner;
    }
}
