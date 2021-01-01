package Animals;

import Food.*;

public abstract class Herbivore extends Animal {

    public Herbivore(String nickname) {
        super(nickname);
    }

    @Override
    public void eat(Food food) throws Exception {
        if (food instanceof Meat)
            throw new WrongFoodException();
        setSaturationDegree(food.getSaturation());
    }
}
