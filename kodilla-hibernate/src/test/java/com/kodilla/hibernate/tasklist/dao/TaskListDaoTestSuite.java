package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {


    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION="TEST: TASKLIST ENTRY";
    private static final String LISTNAME="FIRST LIST";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList= new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listname=taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(listname);

        //Then
        assertEquals(1, readTaskLists.size());

        int id= readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
