package com.ashok.TaskBoardCrud.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
@Document(collection = "taskBoard")
public class TaskBoard {

    @Id
    private String id;
    private String taskId;
    private LocalDate date;
    private TaskType taskType;
    private String projectName;
    private String projectOwnerId;
    private String employeeId;
    private String resourceName;
    private String title;
    private String titleDescription;
    private TaskStatus taskStatus;
    private LocalDateTime estimationTime;
    private LocalDateTime actualTime;
    private String comments;

}

