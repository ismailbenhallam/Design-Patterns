
//Receiver
public class Tv {
    private boolean on;
    private boolean sound = true;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public void mute() {
        sound = true;
    }

    public void unmute() {
        sound = false;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "on=" + on +
                ", sound=" + sound +
                '}';
    }

    public boolean isMuted() {
        return !sound;
    }

    public boolean isOn() {
        return on;
    }
}