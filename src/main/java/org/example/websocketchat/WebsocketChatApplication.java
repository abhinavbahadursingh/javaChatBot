package org.example.websocketchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketChatApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(WebsocketChatApplication.class, args);
        } catch (Exception e) {
            // Print the error to the console
            System.err.println("Application failed to start:");
            e.printStackTrace();
        }
    }
}
