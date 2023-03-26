public class Monster {
    
    private int damage;
    private String name;

    public Monster(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Robot target) {
        int damage = getAttackPower() - target.getDefensePower();
        if (damage > 0) {
            target.takeDamage(damage);
            System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage.");
        } else {
            System.out.println(getName() + " attacks " + target.getName() + " but it has no effect.");
        }
    }

    public String getName() {
        return name;
    }

    private int getAttackPower() {
        return 0;
    }

    public int getHealth() {
        return 0;
    }
}
