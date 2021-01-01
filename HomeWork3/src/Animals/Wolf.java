package Animals;

public class Wolf extends Predator implements Run, Swim, Voice {
    public Wolf(String nickname) {
        super(nickname);
        setEnclosureSize(20);
    }

    @Override
    public void run() {
        System.out.println("Волк бежит");
    }

    @Override
    public void swim() {
        System.out.println("Волк плывет");
    }

    @Override
    public String voice() {
        return "Волк орет";
    }
}
