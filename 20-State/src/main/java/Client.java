public class Client {

    public static void main(String[] args) {
        Mobile mobile = new Mobile(new NormalAlertState());
        System.out.println(">>> Set mobile state to NORMAL");
        mobile.alert(new Alert("Message from Saadia", "Hello, it's me. I was wondering if after all these years you'd like to meet", Alert.AlertType.MESSAGE));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));

        mobile.setAlertState(new SilentAlertState());
        System.out.println(">>> Set mobile state to SILENT");
        mobile.alert(new Alert("Message from Saadia", "Hello, can you hear me? I'm in California dreaming about who we used to be", Alert.AlertType.MESSAGE));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));

        mobile.setAlertState(new DoNotDisturbState());
        System.out.println(">>> Set mobile state to DO NOT DISTURB");
        mobile.alert(new Alert("Message from Saadia", "Hello from the other side. I must've called a thousand times", Alert.AlertType.MESSAGE));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Saadia", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Your Boss", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Your Boss", Alert.AlertType.CALL));
        mobile.alert(new Alert("Call", "Your Boss", Alert.AlertType.CALL));

        mobile.setAlertState(new NormalAlertState());
        System.out.println(">>> Set mobile state to NORMAL");
        mobile.alert(new Alert("Message from Your Boss", "You're fired!", Alert.AlertType.MESSAGE));
    }
}
