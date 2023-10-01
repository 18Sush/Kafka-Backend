//package com.shubh.javakafka;
//
//import com.proj.kafkachat.constants.KafkaConstants;
//import com.proj.kafkachat.controller.ChatController;
//import com.proj.kafkachat.model.Message;
//import com.proj.kafkachat.model.MessageType;
//import com.proj.kafkachat.service.UserService;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.time.LocalDateTime;
//
//import static org.mockito.Mockito.*;
//
//class ChatControlTest {
//
//    @Test
//    void testSendMessageText() throws IOException {
//        // Mocking dependencies
//        SimpMessagingTemplate simpMessagingTemplate = mock(SimpMessagingTemplate.class);
//        KafkaTemplate<String, Message> kafkaTemplate = mock(KafkaTemplate.class);
//        UserService userService = mock(UserService.class);
//
//        // Creating an instance of ChatController with mocked dependencies
//        ChatController chatController = new ChatController(simpMessagingTemplate, kafkaTemplate);
//
//        // Mocking request parameters
//        String sender = "user1";
//        MessageType type = MessageType.TEXT;
//        String content = "Hello, world!";
//        MultipartFile file = null;
//
//        // Call the sendMessage method
//        chatController.sendMessage(sender, content, type, content, file);
//
//        // Verify that the message is sent to Kafka
//        Message expectedMessage = new Message(sender, content, LocalDateTime.now().toString(), null, null, null, content);
//        verify(kafkaTemplate).send(KafkaConstants.KAFKA_TOPIC, expectedMessage);
//    }
//}
