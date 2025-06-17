package com.aion.notificationservice.configuration;

import com.aion.notificationservice.dto.OrderCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderEventListener {

    private final JavaMailSender mailSender;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void handleOrderCreated(OrderCreatedEvent event) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(event.getUserEmail());
        message.setSubject("Order Confirmation");
        message.setText("Your order " + event.getOrderId() + " has been received. Thank you!");

        mailSender.send(message);
    }
}
