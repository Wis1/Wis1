package com.kodilla.spring.portfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BoardConfig {

    @Bean(name="list1")
    @Scope("prototype")
    public TaskList list1(){
        return new TaskList();
    }

    @Bean(name="list2")
    @Scope("prototype")
    public TaskList list2(){
        return new TaskList();
    }

    @Bean(name="list3")
    @Scope("prototype")
    public TaskList list3(){
        return new TaskList();
    }

}
