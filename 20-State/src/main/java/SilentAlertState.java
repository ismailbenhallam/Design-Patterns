
// Concrete State 1
public class SilentAlertState implements MobileAlertState {

    public void alert(Alert alert) {
        System.out.printf("<%s>: %s%n", alert.getTitle(), alert.getContent());
        delay(500);
    }
}
