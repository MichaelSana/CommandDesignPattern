package commanddesignpattern;
import java.util.HashMap;
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<>();
    commands.put("pickup", PickupCommand);
    commands.put("jump", JumpCommand);
    commands.put("fire", FireCommand);
    commands.put("heal", HealCommand);

    public InputHandler(Robot robot){

    }
    public void InputEntered(String data){
        
    }
}
