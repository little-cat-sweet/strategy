package CommandPattern;

public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;
    public GarageDoorOpenCommand(){

    }
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
