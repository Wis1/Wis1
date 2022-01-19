package com.kodilla.spring.portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Lazy
    @Autowired
    @Qualifier("list1")
    TaskList taskList1;

    @Lazy
    @Autowired
    @Qualifier("list2")
    TaskList taskList2;

    @Lazy
    @Autowired
    @Qualifier("list3")
    TaskList taskList3;

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

    @Bean
    public Board setBoard() {
        Board board = new Board(taskList1, taskList2, taskList3);
        return board;
    }

}
