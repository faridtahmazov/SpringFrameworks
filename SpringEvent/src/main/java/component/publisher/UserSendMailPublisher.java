package component.publisher;

import component.event.UserSendMailEvent;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserSendMailPublisher {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void userRegisterMessage(){
        User user = new User("Farid", "tahmazovfarid", "tahmazovfarid7@gmail.com", "00000");
        String title = "Task #2";
        String content = "It's content";

        UserSendMailEvent event = new UserSendMailEvent(user, title, content);
        eventPublisher.publishEvent(event);
    }
}
