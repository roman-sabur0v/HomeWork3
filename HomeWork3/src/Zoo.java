import Animals.*;
import Food.*;

public class Zoo {

    public static void main(String[] args) throws Exception {
        Cow cow = new Cow("Mu");
        Duck duck = new Duck("Krya");
        Eagle eagle = new Eagle("Vasya");
        Fish fish = new Fish("Nemo");
        Rabbit rabbit = new Rabbit("Bunny");
        Wolf wolf = new Wolf("Vika");
        /*
        Apple apple = new Apple();
        Berry berry = new Berry();
        Flesh flesh = new Flesh();
        Frog frog = new Frog();
        Vegetables vegetables = new Vegetables();
        Worm worm = new Worm();

        Worker worker = new Worker();

        worker.feed(cow, apple);
        //worker.feed(duck, flesh); *исключение с текстом ошибки*
        worker.feed(duck, berry);
        worker.feed(eagle, frog);
        worker.feed(fish, worm);
        worker.feed(rabbit, vegetables);
        //worker.feed(wolf, vegetables); *исключение с текстом ошибки*
        worker.feed(wolf, flesh);

        worker.getVoice(cow);
        worker.getVoice(duck);
        //worker.getVoice(fish); *компилятор не пропускает эту строку кода*
        worker.getVoice(eagle);
        worker.getVoice(rabbit);
        worker.getVoice(wolf);

        Swim[] waterfowl = new Swim[5];
        waterfowl[0]=duck;
        waterfowl[1]=wolf; //да волки тоже могут плавать, пусть поплавает если хочет
        waterfowl[2]=fish;
        waterfowl[3]=new Duck();
        waterfowl[4]=new Fish();

        for (Swim animal : waterfowl) {
            animal.swim();
        }
         */

        Enclosure<Herbivore> e1 = new Enclosure<>(Size.BIG);
        Enclosure<Predator> e2 = new Enclosure<>(Size.VERY_BIG);
        e1.addAnimal(cow);
        //e1.addAnimal(wolf); *компилятор не пропускает такой код, аналогично и обратное*
        e1.addAnimal(duck);
        e1.addAnimal(rabbit);

        e2.addAnimal(wolf);
        e2.addAnimal(eagle);
        e2.addAnimal(fish);

        System.out.println(e1.getAnimal("Mu").getNickname());
        e1.removeAnimal(cow);
        //System.out.println(e1.getAnimal("Mu").getNickname()); *NullPointerException*

        System.out.println(e2.getAnimal("Vika").getNickname());
        e2.removeAnimal(wolf);
        //System.out.println(e2.getAnimal("Vika").getNickname()); *NullPointerException*
    }
}
