public class Melee extends Robot{
    private int meleePower;

    // Constructor atribut melee
    public Melee(String name, int health, int maxHealth, int power, int meleePower) {
        super(name, "Melee", health, maxHealth, power);
        this.meleePower = meleePower;
    }

    
    public int getMeleePower() {
        return meleePower;
    }

    // timpa method dari robot class
    @Override
    public void move() {
        System.out.println(getName() + " is moving towards the enemy!");
    }

    @Override
    public void attack(Monster monster) {
        System.out.println(getName() + " is attacking with a melee attack!");
    }

    @Override
    public void defend(Monster monster) {
        System.out.println(getName() + " is defending against the enemy attack!");
    }

    @Override
    public void heal() {
        System.out.println(getName() + " is healing itself with a medkit!");
    }

    public void setMeleePower(int meleePower) {
        this.meleePower = meleePower;
    }
}
