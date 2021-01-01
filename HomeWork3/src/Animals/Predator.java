package Animals;

import Food.*;

public abstract class Predator extends Animal {

    public Predator(String nickname) {
        super(nickname);
    }

    @Override
    public void eat(Food food) throws Exception {
        if (food instanceof Grass)
            throw new WrongFoodException();
        setSaturationDegree(food.getSaturation());
    }
}
