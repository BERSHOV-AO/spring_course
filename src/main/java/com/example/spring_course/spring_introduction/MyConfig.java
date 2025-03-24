package com.example.spring_course.spring_introduction;

import org.springframework.context.annotation.*;

//@Configuration
//@ComponentScan("com.example.spring_course.spring_introduction")

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean    // bin id название метода
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }


}
