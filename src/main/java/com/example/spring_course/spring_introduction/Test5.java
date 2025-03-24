package com.example.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog myDog1 = context.getBean("myPet", Dog.class);
        myDog1.say();



        context.close();
    }
}
