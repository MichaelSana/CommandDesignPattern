package CommandDesignPattern;
/**
 * The main Fire command class
 * @author Michael
 * @author Brady
 * @author Jesse
 */
public class FireCommand implements Command {
    private Robot robot;
    /**
     * Assigns the robot which will be firing
     * @param robot the robot which will fire
     */
    public FireCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * executes the fire command
     */
    @Override
    public void execute() {
        robot.fire();

    }
    
}
