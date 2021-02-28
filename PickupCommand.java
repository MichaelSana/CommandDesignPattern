package CommandDesignPattern;
/**
 * The main class for the jump command
 * @author Michael
 * @author Brady
 * @author Jesse
 */
public class PickupCommand implements Command {
    private Robot robot;

    /**
     * Assigns the robot that will pickup
     * @param robot the robot that is going to pick up something
     */
    public PickupCommand(Robot robot){
        this.robot = robot;
    }
    
    /**
     * executes the pick up command
     */
    @Override
    public void execute() {
        robot.pickup();

    }
    
}
