package CommandPattern;

public class SimpleRemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;


    public void setCommand(int slot, Command onCommand, Command offCommand){
        if(slot < 0 || slot >= 7) return;
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public SimpleRemoteControl(){
        NoCommand noCommand = new NoCommand();
        onCommands = new Command[7];
        offCommands = new Command[7];
        for(int i = 0; i < onCommands.length; i ++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    };

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("\n--------------------Remote control--------------------\n");
        for(int i = 0; i < onCommands.length; i ++){
            res.append("[slot ").append(i).append("] : ").append("on command : ").append(onCommands[i].getClass().getName()).append(" offCommand").append(offCommands[i].getClass().getName() + "" +
                    "\n");
        }
        return res.toString();
    }
}
