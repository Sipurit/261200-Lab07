public class Stamina {
    private int current;
    private int max;

    public Stamina(int max) {
        this.max = max;
        this.current = max;
    }

    public int getCurrent() {
        return current;
    }

    public void use(int amount) {
        current -= amount;
        System.out.println(
                "Character swings the sword. Stamina is now " +
                        current + "."
        );
        if (current <= 0) {
            current = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    public void restore() {
        current = max;
    }
}
