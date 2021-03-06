package com.example.apiserver2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver implements MessageListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);


    @Override
	public void onMessage(Message message, byte[] pattern) {
        LOGGER.info("Received Message :      " + message);
    }
}
