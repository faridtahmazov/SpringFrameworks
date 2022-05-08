package component.listener;

import component.event.UserSendMailEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent> {
    @Override
    public void onApplicationEvent(UserSendMailEvent event) {
        System.out.println("User: " + event.getUser());
        System.out.println("Title: " + event.getTitle());
        System.out.println("Content: " + event.getContent());
    }
}
