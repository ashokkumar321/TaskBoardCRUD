package com.ashok.TaskBoardCrud.service;


import com.ashok.TaskBoardCrud.model.TaskBoard;
import com.ashok.TaskBoardCrud.repository.TaskBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskBoardService {

    @Autowired
   private TaskBoardRepository taskBoardRepository;

    public TaskBoard addTaskBoard(TaskBoard taskboard){
        return taskBoardRepository.save(taskboard);
    }

    public List<TaskBoard> getAllTaskBoard(){
        return taskBoardRepository.findAll();
    }

    public TaskBoard getTaskBoardById(String id){
        return taskBoardRepository.findById(id).orElse(null);
    }


    public void deleteTaskBoard(String id){
        taskBoardRepository.deleteById(id);
    }

    public TaskBoard updateTaskBoard(String id,TaskBoard taskboard){

            return taskBoardRepository.save(taskboard);

    }


}
