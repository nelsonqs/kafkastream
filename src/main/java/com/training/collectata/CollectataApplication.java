package com.training.collectata;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

@SpringBootApplication
public class CollectataApplication {
    public static final String LINK = "ws://stream.meetup.com/2/rsvps";
    public static void main(String[] args){
        SpringApplication.run(CollectataApplication.class, args);
    }
    @Bean
    public ApplicationRunner initializeCollection (RsvpsWebSocketHandler rsvpsWebSocketHandler){
        return args -> {
            WebSocketClient rsvpcleint = new StandardWebSocketClient();
            rsvpcleint.doHandshake(rsvpsWebSocketHandler,LINK);
        };
    }
}
