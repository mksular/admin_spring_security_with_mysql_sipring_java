package com.uby.admin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.uby.admin.Models.Todo;
import com.uby.admin.Repostories.TodoRepository;

@Service
@Transactional
public class TodoService {
    @Autowired
    private TodoRepository repo;

    public List<Todo> todoList() {
        return repo.findAll();        
    }
    
}
