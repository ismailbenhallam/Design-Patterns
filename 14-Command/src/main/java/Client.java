
public class Client {

    public static void main(String[] args) {
        Remote control = new Remote();
        Tv tv = new Tv();
        Command turnsOn = new TvOnCommand(tv);
        Command turnsOff = new TvOffCommand(tv);
        Command mute = new MuteSoundCommand(tv);
        Command unmute = new UnmuteSoundCommand(tv);

        //switch on
        control.addCommand(turnsOn);
        control.addCommand(turnsOff);
        control.addCommand(mute);
        control.execute();

        //switch off
        control.addCommand(turnsOff);
        control.addCommand(turnsOn);
        control.addCommand(mute);
        control.addCommand(turnsOn);
        control.addCommand(turnsOn);
        control.addCommand(turnsOn);
        control.addCommand(unmute);
        control.addCommand(mute);
        control.addCommand(turnsOff);
        control.execute();
    }
}