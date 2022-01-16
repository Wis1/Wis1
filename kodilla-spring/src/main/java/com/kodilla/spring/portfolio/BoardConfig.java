package com.kodilla.spring.portfolio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    ApplicationContext context;
    TaskList taskList;

    {
        assert context != null;
        taskList = context.getBean(TaskList.class);
    }

    @Bean
    public Board getBoard(){
        return new Board(taskList.list1(),taskList.list2(),taskList.list3());
    }

}
