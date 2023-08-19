package com.uby.admin.Repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uby.admin.Models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
    
}
