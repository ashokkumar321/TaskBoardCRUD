package com.ashok.TaskBoardCrud.controller;


import com.ashok.TaskBoardCrud.model.TaskBoard;
import com.ashok.TaskBoardCrud.service.TaskBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taskboard")
public class TaskBoardController {

    @Autowired
    private TaskBoardService taskBoardService;

    @PostMapping("/add")
    public TaskBoard addTaskBoard(@RequestBody TaskBoard taskboard){
        return taskBoardService.addTaskBoard(taskboard);
    }

    @GetMapping("/all")
    public List<TaskBoard> getAllTaskBoard(){
        return taskBoardService.getAllTaskBoard();
    }

    @GetMapping("/details/{id}")
    public TaskBoard getTaskBoardById(@PathVariable String id){
        return taskBoardService.getTaskBoardById(id);
    }

    @DeleteMapping("delete/{id}")
    public  String deleteTaskBoard(@PathVariable String id){
        taskBoardService.deleteTaskBoard(id);
        return "TaskBoard delete with id "+ id;
    }

    @PutMapping("/update/{id}")
    public TaskBoard updateTaskBoard(@PathVariable String id,@RequestBody TaskBoard taskboard){
        return taskBoardService.updateTaskBoard(id,taskboard);
    }


}
