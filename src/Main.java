public class Main {
    public static void main(String[] args) {

        Character hero = new Character(100, 50);

        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();

        hero.takeDamage(30);
        hero.takeDamage(50);
        hero.takeDamage(20);

        hero.rest();

        System.out.println(
                "Character's health: " + hero.getHealth() +
                        ", stamina: " + hero.getStamina() + "."
        );
    }
}
