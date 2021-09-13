
public class DoNotDisturbState implements MobileAlertState {
    @Override
    public void alert(Alert alert) {
        delay(500);
    }
}
