public class Charizard extends Pokemon {

    /**
     * @param name
     * @param weight
     * @param types
     * @param weaknesses
     * @param experience
     * @param level
     * @param hp
     */

    public Charizard(String name, float weight, String[] types, String[] weaknesses, int hp) {
        super(name, weight, new String[] { "Fire" }, new String[] { "Water" }, hp);
    }

}
