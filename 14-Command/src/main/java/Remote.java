import java.util.ArrayDeque;
import java.util.Queue;

// Invoker
public class Remote {
    private final Queue<Command> commands = new ArrayDeque<>();

    public void addCommand(Command command) {
        commands.offer(command);
    }

    public void execute() {
        System.out.println("--------------------");
        System.out.println("Remote.execution..");
        if (!commands.isEmpty()) {
            while (!commands.isEmpty()) {
                try {
                    Thread.sleep(1000);
                    commands.remove().execute();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Remote error : no command to execute");
        }
    }
}
