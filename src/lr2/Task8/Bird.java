package lr2.Task8;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void chirp() {
        System.out.println(getName() + " чирикает");
    }

    public boolean fly() {
        return canFly;
    }
}
