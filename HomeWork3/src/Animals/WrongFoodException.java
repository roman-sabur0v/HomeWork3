package Animals;

public class WrongFoodException extends Exception {
    public WrongFoodException() { super("Неверный тип еды для данного животного"); }
}
