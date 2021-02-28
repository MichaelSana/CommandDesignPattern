package CommandDesignPattern;
import java.util.HashMap;
/**
 * Inputs the commands that the robot will do
 * @author Michael
 * @author Brady
 * @author Jesse
 */
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();
    private Command FireCommand;
    private Command PickupCommand;
    private Command JumpCommand;
    private Command HealCommand;

    /**
     * Tells the robot which command to do based on user input
     * @param robot the robot being commanded
     */
    public InputHandler(Robot robot){
        commands.put("pickup", PickupCommand);
        commands.put("jump", JumpCommand);
        commands.put("fire", FireCommand);
        commands.put("heal", HealCommand);
    }

    /**
     * takes the input entered and makes the robot get the command to do
     * @param data the data enetered by the user
     */
    public void InputEntered(String data){
        if (commands.containsKey(data)) {
            Command command = commands.get(data);
            command.execute();
        }
    }
}
