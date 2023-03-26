public class SupportRobot extends Robot{
    // skill special untuk heal diri sendiri dan robot lain
    private int healingPower;

    public SupportRobot(String name, int health, int maxHealth, int power, int healingPower) {
        super(name, "support", health, maxHealth, power);
        this.healingPower = healingPower;
    }

    // timpa method attack untuk lakukan special skill support
    @Override
    public void attack(Monster monster) {
        System.out.println(getName() + " uses a ranged attack!");
    }

    @Override
    public void defend(Monster monster) {
        System.out.println(getName() + " defends with a shield!");
    }

    // method untuk heal diri sendiri dan robot lain
    public void heal(Robot robot) {
        int amountToHeal = healingPower;
        robot.setHealth(Math.min(robot.getHealth() + amountToHeal, robot.getMaxHealth()));
        System.out.println(getName() + " heals " + robot.getName() + " for " + amountToHeal + " health!");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("SupportRobot berpindah");
    }

    @Override
    public void heal() {
        // TODO Auto-generated method stub
        System.out.println("SupportRobot heal");
    }
}
