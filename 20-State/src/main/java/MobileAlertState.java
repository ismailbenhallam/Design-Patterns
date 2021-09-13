
// State
public interface MobileAlertState {

    void alert(Alert alert);

    default void delay(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
