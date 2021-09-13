
//Concrete Command
public class TvOnCommand implements Command {
    //reference to the receiver
    private final Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        if (tv.isOn()) {
            System.out.println("xxx TvOnCommand not executed: Tv is already on");
        } else {
            tv.switchOn();
            System.out.println(">>> TvOnCommand executed :)");
        }
    }

} 