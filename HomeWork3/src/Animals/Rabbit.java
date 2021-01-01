package Animals;

public class Rabbit extends Herbivore implements Run, Voice {
    public Rabbit(String nickname) {
        super(nickname);
        setEnclosureSize(3);
    }

    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public String voice() {
        return "Истошные крики крольчатины";
    }
}
