import java.util.List;
import java.util.ArrayList;

public class CentralBrain extends Robot implements Combining{
    public CentralBrain(String name, String type, int health, int maxHealth, int power2) {
        super(name, type, health, maxHealth, power2);
        //TODO Auto-generated constructor stub
    }

    private List<Robot> componentRobots;


    public void addComponentRobot(Robot robot) {
        this.componentRobots.add(robot);
    }

    public void removeComponentRobot(Robot robot) {
        this.componentRobots.remove(robot);
    }

    @Override
    public void move() {
        System.out.println(getName()+ " is moving.");
    }

    @Override
    public void attack(Monster monster) {
        System.out.println(getName() + " is attacking.");
    }

    @Override
    public void defend(Monster monster) {
        System.out.println(getName() + " is defending against " + monster.getName() + ".");
    }

    @Override
    public void heal() {
        System.out.println(getName() + " is healing.");
    }

    @Override
    public void combine() {
        System.out.println(getName() + " is combining into a larger robot.");
    }

    @Override
    public void separate() {
        System.out.println(getName() + " is separating into smaller robots.");
    }

    public List<Robot> getComponentRobots() {
        return componentRobots;
    }

    public void setComponentRobots(List<Robot> componentRobots) {
        this.componentRobots = componentRobots;
    }
    
}
