package Animals;

public class Eagle extends Predator implements Fly, Voice, Run {

    public Eagle(String nickname) {
        super(nickname);
        setEnclosureSize(15);
    }

    @Override
    public void fly() {
        System.out.println("Орел летит");
    }

    @Override
    public void run() {
        System.out.println("Орел перебирает своими лапищами");
    }

    @Override
    public String voice() {
        return "*невозможно буквами описать его крик, но я попробую...* ъиьеъи";
    }
}
