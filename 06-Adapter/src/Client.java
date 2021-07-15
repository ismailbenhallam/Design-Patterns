import java.io.File;
import java.util.List;

public class Client {
    private final File f = new File("06-Adapter/out/class-adapter.txt");

    public Client() {
        exp01();
        exp02();
    }

    // Object Adapter
    private void exp01() {
        List<Target> targets = List.of(
                new object_adapter.DataLoggerAdapter(new DataLogger()),
                new object_adapter.DataWriterAdapter(new DataWriter())
        );
        for (Target t : targets) {
            t.save(f, "Some data to save");
        }
    }

    // Class Adapter
    private void exp02() {
        List<Target> targets = List.of(
                new class_adapter.DataLoggerAdapter(),
                new class_adapter.DataWriterAdapter()
        );
        for (Target t : targets) {
            t.save(f, "Some data to save");
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
