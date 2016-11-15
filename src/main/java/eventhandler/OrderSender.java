package eventhandler;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Created by dewi on 15.11.16.
 */
public class OrderSender implements EventSender {

    @Inject
    private Event<String> event;

    @Override
    public void send(String message) {
        event.fire(message);
    }
}
