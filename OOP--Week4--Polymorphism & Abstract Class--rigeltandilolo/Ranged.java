public class Ranged extends Robot {
    private int rangedPower;

    // Constructor atribut ranged
    public Ranged(String name, int health, int maxHealth, int power, int rangedPower) {
        super(name, "Ranged", health, maxHealth, power);
        this.rangedPower = rangedPower;
    }

    public int getRangedPower() {
        return rangedPower;
    }

    //timpa method dari class robot
    @Override
    public void move() {
        System.out.println(getName() + " is moving to a strategic location!");
    }

    @Override
    public void attack(Monster monster) {
        System.out.println(getName() + " is attacking with a ranged weapon!");
    }

    @Override
    public void defend(Monster monster) {
        System.out.println(getName() + " is using cover to defend against enemy attacks!");
    }

    @Override
    public void heal() {
        System.out.println(getName() + " is using a medkit to heal itself!");
    }
}