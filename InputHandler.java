package CommandDesignPattern;
import java.util.HashMap;
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();
    private Command FireCommand;
    private Command PickupCommand;
    private Command JumpCommand;
    private Command HealCommand;

    public InputHandler(Robot robot){
        commands.put("pickup", PickupCommand);
        commands.put("jump", JumpCommand);
        commands.put("fire", FireCommand);
        commands.put("heal", HealCommand);
    }
    public void InputEntered(String data){
        if (commands.containsKey(data)) {
            Command command = commands.get(data);
            command.execute();
        }
    }
}
