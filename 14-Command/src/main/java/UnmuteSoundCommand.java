
//Concrete Command
public class UnmuteSoundCommand implements Command {
    //reference to the receiver
    private final Tv tv;

    public UnmuteSoundCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        if (!tv.isMuted()) {
            System.out.println("xxx UnmuteSoundCommand not executed: Tv is already not muted");
        } else {
            tv.unmute();
            System.out.println(">>> UnmuteSoundCommand executed :)");
        }
    }

} 