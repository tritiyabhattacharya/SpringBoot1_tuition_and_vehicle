package com.example.tuition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubjectConfig {
    @Bean
    public SubjectJava getjava() {
        return new  SubjectJava();
    }
    @Bean
    public SubjectPython getpython() {
        return new  SubjectPython();
    }
    @Bean
    public  SubjectSQL getsql() {
        return new SubjectSQL();
    }
    @Bean
    public  String data() {
        return "not possible.....";
    }
    @Bean
    public Teacher getTeacher() {
        return new Teacher(getpython());//DI
    }
}
