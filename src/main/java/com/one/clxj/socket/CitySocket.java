package com.one.clxj.socket;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;
@ServerEndpoint("/socket/City")
@Component
public class CitySocket extends SuperSocket {
    @Override
    public String me() {
        return null;
    }

    @Override
    public void init() {

    }
}