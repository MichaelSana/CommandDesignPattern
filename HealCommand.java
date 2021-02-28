package CommandDesignPattern;
/**
 * The main class for the heal command
 * @author Michael
 * @author Brady
 * @author Jesse
 */
public class HealCommand implements Command{
    private Robot robot;

    /**
     * assigns the robot that the heal command will be healing
     * @param robot the robot being healed
     */
    public HealCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * Executes the heal command
     */
    @Override
    public void execute() {
        robot.heal();
    }
    
}
