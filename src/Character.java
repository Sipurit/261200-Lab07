public class Character {

    private Health health;
    private Stamina stamina;

    public Character(int maxHealth, int maxStamina) {
        health = new Health(maxHealth);
        stamina = new Stamina(maxStamina);

        System.out.println(
                "Character created with " +
                        health.getCurrent() + " health and " +
                        stamina.getCurrent() + " stamina."
        );
    }

    public void swingSword() {
        stamina.use(10);
    }

    public void takeDamage(int damage) {
        health.takeDamage(damage);
    }

    public void rest() {
        health.restore();
        stamina.restore();
        System.out.println(
                "Character has rested. Health and stamina restored to maximum."
        );
    }

    public int getHealth() {
        return health.getCurrent();
    }

    public int getStamina() {
        return stamina.getCurrent();
    }
}
