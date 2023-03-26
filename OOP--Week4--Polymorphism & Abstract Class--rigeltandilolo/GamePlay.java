import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GamePlay {
    private List<Robot> robots;
    

    public GamePlay(List<Robot> robots) {
        this.robots = robots;
    }

    // public void play() {
    //     // Choose a random robot to act as the central brain
    //     CentralBrain centralBrain = (CentralBrain) robots.get(new Random().nextInt(robots.size()));

    //     // Combine the robots into the larger robot
    //     centralBrain.combine();

    //     // // Find a monster to fight
    //     // Monster monster = new Monster("Godzilla", 500, 50, 0, 0);

    //     // Fight the monster until it is defeated
    //     while (monster.getHealth() > 0 && centralBrain.getHealth() > 0) {
    //         // Move the robot to a random location
    //         centralBrain.move();

    //         // Attack the monster
    //         centralBrain.attack(monster);

    //         // Defend against the monster's attack
    //         centralBrain.defend(monster);

    //         // Print the current status of the fight
    //         System.out.println("Robot health: " + centralBrain.getHealth() + ", Monster health: " + monster.getHealth());
    //     }

    //     // If the robot is still alive, it has defeated the monster
    //     if (centralBrain.getHealth() > 0) {
    //         System.out.println("Robot has defeated the monster!");
    //     } else {
    //         System.out.println("Robot has been defeated by the monster.");
    //     }

    //     // Separate the robots back into their individual parts
    //     centralBrain.separate();
    // }

    public static void main(String[] args) {
        
        // Create a list of robots to use in the game
        Robot[] componentRobots = {
        new Melee("Melee 1", 100, 100, 20, 40),
        new Melee("Melee 2", 100, 100, 19, 35),
        new Ranged("Ranged 1", 90, 100, 15, 20),
        new SupportRobot("Support 1", 80, 100, 18, 10),
        new CentralBrain("Main Robot", "robot1", 100, 100, 01),
        };

        // // Create a new game and play it
        // GamePlay game = new GamePlay(robots);
        // game.play();

        // Find a monster to fight
        Monster monster = new Monster(500, "Godzila");
        CentralBrain centralBrain = new CentralBrain("Main Robot", "robot1", 100, 100, 01);
        System.out.println("Demonstrating movement and communication of smaller robots:");
        // centralBrain.setName("monster1");
        centralBrain.move();
        centralBrain.defend(monster);
        centralBrain.attack(monster);
        centralBrain.heal();
        centralBrain.combine();
        for (Robot componentRobot : componentRobots) {
            if (componentRobot instanceof Melee) {
                ((Melee) componentRobot).attack(monster);
            } else if (componentRobot instanceof Ranged) {
                ((Ranged) componentRobot).attack(monster);
            } else if (componentRobot instanceof SupportRobot) {
                ((SupportRobot) componentRobot).attack(monster);
            }
    }
}
}