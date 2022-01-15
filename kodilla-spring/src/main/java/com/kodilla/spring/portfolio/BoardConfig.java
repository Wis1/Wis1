package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("list1")
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board(taskList);
    }

    @Bean(name="list1")
    @Scope("prototype")
    public TaskList list1(){

        return new TaskList();
    }
    @Bean
    @Scope("prototype")
    public TaskList list2(){

        return new TaskList();
    }
    @Bean
    @Scope("prototype")
    public TaskList list3(){

        return new TaskList();
    }
}
