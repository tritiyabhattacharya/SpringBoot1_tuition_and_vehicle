package com.example;

import com.example.tuition.Teacher;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
        TravelAgent tr=(TravelAgent)context.getBean(TravelAgent.class);
        tr.startJourney();

        IO.println("--------------------------------");

        Teacher t=(Teacher)context.getBean("getTeacher");
        t.start_class();
    }

}
