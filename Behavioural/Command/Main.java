//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Device tv=new TV();
        Device stereo=new Stereo();

        Command tunOnTV=new TurnOnCommand(tv);
        tunOnTV.execute();
        Command turnOffTv=new TurnOffCommand(tv);
        turnOffTv.execute();

        Command turOnStereo=new TurnOnCommand(stereo);
        turOnStereo.execute();

        Command turnOffStereo=new TurnOffCommand(stereo);
        turnOffStereo.execute();




    }


}