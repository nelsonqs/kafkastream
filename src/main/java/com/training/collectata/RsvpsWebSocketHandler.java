package com.training.collectata;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class RsvpsWebSocketHandler extends AbstractWebSocketHandler {
    private static final Logger logger = Logger.getLogger(RsvpsWebSocketHandler.class.getName());
    private final RsvpsKafkaProducer rsvpsKafkaProducer;

    public RsvpsWebSocketHandler(RsvpsKafkaProducer rsvpsKafkaProducer) {
        this.rsvpsKafkaProducer = rsvpsKafkaProducer;
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
       logger.log(Level.INFO, "New RSVP: \n {0}", message.getPayload());
       rsvpsKafkaProducer.sendRsvpMessage(message);
    }
}
