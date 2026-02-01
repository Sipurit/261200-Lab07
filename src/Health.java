public class Health {
    private int current;
    private int max;

    public Health(int max) {
        this.max = max;
        this.current = max;
    }

    public int getCurrent() {
        return current;
    }

    public void takeDamage(int damage) {
        current -= damage;
        System.out.println(
                "Health is now " + current + "."
        );
        if (current <= 0) {
            current = 0;
            System.out.println("Character is dead.");
        }
    }

    public void restore() {
        current = max;
    }
}
