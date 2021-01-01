package Animals;

public class Duck extends Herbivore implements Swim, Voice, Fly, Run {
    public Duck(String nickname) {
        super(nickname);
        setEnclosureSize(4);
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Утка идет");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public String voice() {
        return "Кря-кря";
    }
}
