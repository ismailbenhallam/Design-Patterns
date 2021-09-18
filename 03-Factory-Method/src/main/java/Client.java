import javax.swing.JButton;
import javax.swing.JFrame;

public class Client extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JButton[] buttons;

    public Client() {
        buttons = new JButton[]{new JButton(" Valider "), new JButton(" Annuler ")};

        BorderPanel p1 = newEtchedBorder();

        getContentPane().add("North", p1);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    BorderPanel newSoftBevelBorder() {
        return new SoftBevelBorder(buttons);
    }

    BorderPanel newEtchedBorder() {
        return new EtchedBorder(buttons);
    }

    BorderPanel newBlueLineBorder() {
        return new BlueLineBorder(buttons);
    }

    public static void main(String[] args) {
        new Client();
    }

}
