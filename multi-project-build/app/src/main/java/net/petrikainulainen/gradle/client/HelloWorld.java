package net.petrikainulainen.gradle.client;

import net.petrikainulainen.gradle.core.MessageService;
import org.apache.log4j.Logger;

/**
 * @author Petri Kainulainen
 */
public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}
