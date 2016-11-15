package eventhandler;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import java.io.Serializable;

/**
 * Created by dewi on 15.11.16.
 */
@SessionScoped
public class OrderReceiver implements EventReceiver, Serializable {

    String mail = "This is a mail";

    void receive(@Observes(notifyObserver = Reception.IF_EXISTS) String mail) {
        this.mail = mail;
    }

    @Override
    public String sendEmail() {
        return mail;
    }
}
