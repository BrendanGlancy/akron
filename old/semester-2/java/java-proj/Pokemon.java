import java.util.*;

public class Pokemon {
    // instance variables
    private String name;
    private float weight;
    private String[] types;
    private String[] weaknesses;
    private float experience;
    private int level;
    private int hp;

    // constructor
    public Pokemon(String name, float weight, String[] types, String[] weaknesses, int hp) {
        this.name = name;
        this.weight = weight;
        this.weaknesses = weaknesses;
        this.experience = experience;
        this.level = level;
        this.hp = hp;

        // Check if the pokemon has type
        if (types.length == 0) {
            this.types = new String[1];
            this.types[0] = "Normal";
        } else {
            this.types = types;
        }

    }

    // Method to print you pokemons information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Types: " + Arrays.toString(types));
        System.out.println("Weaknesses: " + Arrays.toString(weaknesses));
        System.out.println("HP: " + hp);
    }

    // Method to get the pokemon's name
    public String getName() {
        return this.name;
    }

    // Method to set the pokemon's name
    public void setName(String name) {
        this.name = name;
    }
}
