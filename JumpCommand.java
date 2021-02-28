package CommandDesignPattern;
/**
 * The main class for the jump command
 * @author Michael
 * @author Brady
 * @author Jesse
 */
public class JumpCommand implements Command {
    private Robot robot;

    /**
     * Assigns the robot to which the jump command will be used
     * @param robot the robot that will jump
     */
    public JumpCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * Executes the jump command on the robot
     */
    @Override
    public void execute() {
        robot.jump();

    }
    
}
