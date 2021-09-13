
//Concrete Command
public class TvOffCommand implements Command {
    //reference to the receiver
    private final Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        if (!tv.isOn()) {
            System.out.println("xxx TvOffCommand not executed: Tv is already off");
        } else {
            tv.switchOff();
            System.out.println(">>> TvOffCommand executed :)");
        }
    }

} 