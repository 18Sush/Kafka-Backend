package com.shubh.javakafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.proj.kafkachat.KafkaJavaApp;
import com.proj.kafkachat.constants.KafkaConstants;
import com.proj.kafkachat.consumer.MessageListener;
import com.proj.kafkachat.model.Message;
import com.proj.kafkachat.model.MessageType;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.mockito.Mockito.*;

@SpringBootTest(classes = KafkaJavaApp.class)
class KafkaJavaApplicationTests {

    @Test
    void contextLoads() {
    }
    
   
}


