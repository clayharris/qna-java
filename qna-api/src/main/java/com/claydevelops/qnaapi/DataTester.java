package com.claydevelops.qnaapi;

import com.claydevelops.qnaapi.question.Question;
import com.claydevelops.qnaapi.question.QuestionRepository;
import com.claydevelops.qnaapi.user.User;
import com.claydevelops.qnaapi.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DataTester {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataTester.class);
    private final UserRepository userRepository;
    private final QuestionRepository questionRepository;

    @Autowired
    public DataTester(UserRepository userRepository, QuestionRepository questionRepository) {
        this.userRepository = userRepository;
        this.questionRepository = questionRepository;
    }

    @GetMapping("/listUsers")
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/listQuestions")
    public List<Question> listQuestions() {
        return questionRepository.findAll();
    }


}
