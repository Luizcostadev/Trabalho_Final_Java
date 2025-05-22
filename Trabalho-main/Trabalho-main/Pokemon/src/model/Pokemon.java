package model;

public class Pokemon {
    private Long id;
    private String name;
    private String type;
    private int number;

    public Pokemon(Long id, String name, String type, int number) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.number = number;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public int getNumber() { return number; }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Tipo: " + type + ", Número: " + number + ")";
    }
}
