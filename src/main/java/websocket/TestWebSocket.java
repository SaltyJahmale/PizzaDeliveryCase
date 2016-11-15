package websocket;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * Created by dewi on 15.11.16.
 */

@ServerEndpoint("/socket")
public class TestWebSocket {

    @OnOpen
    public void open(Session session) throws IOException {
        session.getBasicRemote().sendText("OnOpen");
    }

    @OnClose
    public void close(Session session) {

    }

    @OnError
    public void error(Throwable error) {
        error.printStackTrace();
    }

    @OnMessage
    public String handleMessage(String message) throws IOException {
        return message + "Hello form server";
    }
}
