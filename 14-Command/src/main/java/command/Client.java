package command;

import javax.swing.*;

public class Client {

    public Client() {
        exp03();
    }

    void exp01() {

        LoggingReceiver receiver = new ConsoleReceiver();
        Command command = new LoggingCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            int item = (int) (1000 + Math.random() * 9000);
            invoker.add(item);
        }
    }

    void exp02() {

        LoggingReceiver receiver = new FileReceiver("resources/log.txt");
        Command command = new LoggingCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        do {
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            int item = (int) (1000 + Math.random() * 9000);
            invoker.add(item);
        } while (true);
    }

    void exp03() {
        PanelReceiver receiver = new PanelReceiver(700);
        JFrame f = new JFrame();
        f.getContentPane().add("North", receiver);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);

        DrawingCommand command = new DrawingCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        double a = 0;
        do {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            int item = (int) (Math.cos(a) * 350);
            invoker.add(item);

            a = a + 0.1;
        } while (true);
    }

    public static void main(String[] args) {
        new Client();
    }
}
