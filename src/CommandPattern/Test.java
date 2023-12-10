package CommandPattern;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan("Dining Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);



        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
//        simpleRemoteControl.setCommand(0, lightOnCommand, lightOffCommand);
//        simpleRemoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
//        simpleRemoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);
//
//        for(int i = 0; i < 3; i ++){
//            simpleRemoteControl.onButtonWasPushed(i);
//            simpleRemoteControl.offButtonWasPushed(i);
//        }

//        simpleRemoteControl.onButtonWasPushed(0);
//        simpleRemoteControl.offButtonWasPushed(0);
//        System.out.println(simpleRemoteControl);
//        simpleRemoteControl.undoButtonWasPushed();
//        simpleRemoteControl.offButtonWasPushed(0);
//        simpleRemoteControl.onButtonWasPushed(0);
//        System.out.println(simpleRemoteControl);

        simpleRemoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        simpleRemoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);

        simpleRemoteControl.onButtonWasPushed(0);
        simpleRemoteControl.offButtonWasPushed(0);
        System.out.println(simpleRemoteControl);
        simpleRemoteControl.undoButtonWasPushed();
        simpleRemoteControl.onButtonWasPushed(1);
        System.out.println(simpleRemoteControl);
        simpleRemoteControl.undoButtonWasPushed();


    }
}
