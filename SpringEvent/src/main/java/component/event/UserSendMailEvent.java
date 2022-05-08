package component.event;

import model.User;
import org.springframework.context.ApplicationEvent;

public class UserSendMailEvent extends ApplicationEvent {
    private User user;
    private String title;
    private String content;

    public UserSendMailEvent(User user, String title, String content) {
        super(user);
        this.user = user;
        this.title = title;
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
}
