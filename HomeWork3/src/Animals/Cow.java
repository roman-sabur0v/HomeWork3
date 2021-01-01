package Animals;

public class Cow extends Herbivore implements Run, Voice {

    public Cow(String nickname) {
        super(nickname);
        setEnclosureSize(10);
    }

    @Override
    public void run() {
        System.out.println("Корова бежит");
    }

    @Override
    public String voice() {
        return "Мууу";
    }
}
