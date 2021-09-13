
public class Alert {
    private String title;
    private String content;
    private AlertType type;

    public Alert() {
    }

    public Alert(String title, String content, AlertType type) {
        this.title = title;
        this.content = content;
        this.type = type;
    }

    public enum AlertType {
        CALL, MESSAGE, SYSTEM_NOTIFICATION
    }


    // Getters & setters..

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AlertType getType() {
        return type;
    }

    public void setType(AlertType type) {
        this.type = type;
    }
}
