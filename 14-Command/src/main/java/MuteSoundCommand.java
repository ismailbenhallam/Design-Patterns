
//Concrete Command
public class MuteSoundCommand implements Command {
    //reference to the receiver
    private final Tv tv;

    public MuteSoundCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        if (tv.isMuted()) {
            System.out.println("xxx MuteSoundCommand not executed: Tv is already muted");
        } else {
            tv.mute();
            System.out.println(">>> MuteSoundCommand executed :)");
        }
    }

} 