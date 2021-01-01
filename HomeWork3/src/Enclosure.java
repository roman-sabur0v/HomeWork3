import Animals.*;
import java.util.HashMap;

public class Enclosure<T extends Animal> {
    private int size;
    public int getSize() { return size; }

    private HashMap<String, T> enclosure;

    public Enclosure(Size size) {
        switch (size){
            case SMALL:
                this.size=2;
                break;
            case MEDIUM:
                this.size=6;
                break;
            case BIG:
                this.size=14;
                break;
            case VERY_BIG:
                this.size=40;
                break;
        }
        enclosure=new HashMap<>();
    }

    public void addAnimal(T animal){
        if (animal.getEnclosureSize()<=this.size)
            enclosure.put(animal.getNickname(), animal);
        else System.out.println("Животное не удалось поместить в вольер, т.к. вольер для него слишком мал");
    }

    public void removeAnimal(T animal){
        if (enclosure.containsValue(animal))
            enclosure.remove(animal.getNickname(), animal);
        else System.out.println("такого животного нет в вольере");
    }

    public T getAnimal(String nickname) {
        if (enclosure.containsKey(nickname))
            return enclosure.get(nickname);
        else {
            System.out.println("такого животного нет в вольере (вернется null)");
            return null;
        }
    }
}
