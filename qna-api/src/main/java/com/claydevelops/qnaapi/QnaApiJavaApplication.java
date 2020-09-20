package com.claydevelops.qnaapi;

import com.claydevelops.qnaapi.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class QnaApiJavaApplication{

    public static void main(String[] args) {
        SpringApplication.run(QnaApiJavaApplication.class, args);
    }

}
