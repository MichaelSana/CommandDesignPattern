package CommandDesignPattern;

public class FireCommand implements Command {
    private Robot robot;
    public FireCommand(Robot robot){
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.fire();

    }
    
}
