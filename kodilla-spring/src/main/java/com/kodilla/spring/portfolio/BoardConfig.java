package com.kodilla.spring.portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BoardConfig {

    @Bean(name="list1")
    public TaskList list1(){
        return new TaskList();
    }

    @Bean(name="list2")
    public TaskList list2(){
        return new TaskList();
    }

    @Bean(name="list3")
    public TaskList list3(){
        return new TaskList();
    }
    @Autowired
    public Board getBoard( @Qualifier("list1") TaskList list1, @Qualifier("list2") TaskList list2 ,@Qualifier("list3") TaskList list3){
        return new Board(list1, list2, list3);
    }
}
