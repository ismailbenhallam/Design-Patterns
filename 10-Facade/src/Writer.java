import java.io.File;

public class Writer {

    public void write(File f, String data) {
        System.out.printf("Writing %s on '%s'%n", data, f);
        // ...
    }
}