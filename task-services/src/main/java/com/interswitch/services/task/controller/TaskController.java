package com.interswitch.services.task.controller;

import com.interswitch.services.task.models.Task;
import com.interswitch.services.task.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);
	
	@Autowired
	TaskRepository repository;
	
	@PostMapping("/")
	public Task add(@RequestBody Task task) {
		LOGGER.info("Task add: {}", task);
		return repository.add(task);
	}
	
	@GetMapping("/{id}")
	public Task findById(@PathVariable("id") Long id) {
		LOGGER.info("Task find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/")
	public List<Task> findAll() {
		LOGGER.info("Tasks find");
		return repository.findAll();
	}
	
	@GetMapping("/task/{employeeId}")
	public List<Task> findByDepartment(@PathVariable("employeeId") Long employeeId) {
		LOGGER.info("Task find: employeeId={}", employeeId);
		return repository.findByEmployee(employeeId);
	}
	
}
