// abstract class robot
public abstract class Robot {
    protected String name;
    private String type;
    private int health;
    private int maxHealth;
    private int power;

    // Constructor atribut robot
    public Robot(String name, String type, int health, int maxHealth, int power2) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.maxHealth = maxHealth;
        this.power = power;
    }

    public Robot(String name2, String string, int maxHealth2, int power2) {
    }

    // Getter dan setternya
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getPower() {
        return power;
    }

    public int getDefensePower() {
        return 0;
    }

    public void takeDamage(int damage) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // setter method untuk darah robot
    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void move();

    public abstract void attack(Monster monster);

    public abstract void defend(Monster monster);

    public abstract void heal();

}