
// Concrete State 2
public class NormalAlertState implements MobileAlertState {

    @Override
    public void alert(Alert alert) {
        System.out.printf("<%s>: %s%n", alert.getTitle(), alert.getContent());
        java.awt.Toolkit.getDefaultToolkit().beep();
        delay(1900);
    }
}
