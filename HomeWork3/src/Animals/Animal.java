package Animals;
import Food.*;

public abstract class Animal {

    private int saturationDegree;
    public int getSaturationDegree() { return saturationDegree; }
    public void setSaturationDegree(int value) { saturationDegree=value; }

    private String nickname;
    public String getNickname() { return nickname; }
    public void setNickname(String value) { nickname=value; }

    private int enclosureSize;
    public int getEnclosureSize() { return  enclosureSize; }
    void setEnclosureSize(int value) { enclosureSize=value; }

    public Animal(String nickname) {
        this.nickname=nickname;
    }
    public abstract void eat(Food food) throws Exception;

    @Override
    public boolean equals(Object obj) {
        Animal animal = (Animal)obj;
        return nickname==animal.nickname &&
                enclosureSize==animal.enclosureSize &&
                animal.getClass()==this.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode()*31*nickname.hashCode()*enclosureSize*79;
    }
}
