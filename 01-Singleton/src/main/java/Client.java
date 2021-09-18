public class Client {

    public Client() {
        exp();
    }

    private void exp() {
        Employee e1 = new Employee(1, "BENHALLAM Ismaïl");
        Employee e2 = new Employee(2, "ESSAADI Mouad");
        // Manager manager = new Manager(); // Forbidden
        Manager manager = Manager.getInstance();
    }

    public static void main(String[] args) {
        new Client();
    }
}
