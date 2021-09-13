
// Context
public class Mobile {
    private MobileAlertState alertState;

    public Mobile(MobileAlertState alertState) {
        this.alertState = alertState;
    }

    public MobileAlertState getAlertState() {
        return alertState;
    }

    public void setAlertState(MobileAlertState alertState) {
        this.alertState = alertState;
    }

    public void alert(Alert alert) {
        alertState.alert(alert);
    }
}
