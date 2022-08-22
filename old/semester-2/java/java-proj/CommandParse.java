import java.util.*;

class CommandParse {
    private Scanner commandScanner;
    private boolean isRunning;

    private void addPokemon() {
        commandScanner.nextLine();
        System.out.println("Enter the Pokemon type: ");
        String type = commandScanner.nextLine();
        String name = "name";
        int weight = 0;

        System.out.println("Enter the name of the pokemon: ");
        name = commandScanner.nextLine();
        System.out.println("Enter the weight of the pokemon: ");
        weight = commandScanner.nextFloat();

        if (type.equalsIgnoreCase("pikachu")) {
            int hp = 60;
            Pokemon pikachu = new Pikachu(name, weight, hp);
            System.out.println("Pikachu added");
        } else if (type.equalsIgnoreCase("bulbasaur")) {
            int hp = 60;
            Pokemon bulbasaur = new Bulbasaur(name, weight, hp);
            System.out.println("Bulbasaur added");
        } else if (type.equalsIgnoreCase("charizard")) {
            int hp = 60;
            Pokemon charizard = new Charizard(name, weight, hp);
            System.out.println("Charmander added");
        } else {
            System.out.println("Invalid pokemon type");
        }
    }

    private void removePokemon() {
        System.out.print("Enter the name of the pokemon you want to remove: ");
        String name = this.commandScanner.next();
        // add a class to manage pokemon in bag
    }
}
