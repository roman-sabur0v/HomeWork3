package Animals;

public class Fish extends Predator implements Swim {
    public Fish(String nickname) {
        super(nickname);
        setEnclosureSize(1);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывет");
    }
}
