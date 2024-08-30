package com.ashok.TaskBoardCrud.repository;

import com.ashok.TaskBoardCrud.model.TaskBoard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskBoardRepository extends MongoRepository<TaskBoard,String> {
}
