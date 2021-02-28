package commanddesignpattern;

public class PickupCommand implements Command {
    private Robot robot;

    public PickupCommand(Robot robot){
        this.robot = robot;
    }
    
    @Override
    public void execute() {
        robot.pickup();

    }
    
}
