package com.interswitch.services.task;

import com.interswitch.services.task.models.Task;
import com.interswitch.services.task.repository.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskServicesApplication.class, args);
    }

    @Bean
    TaskRepository repository() {
        TaskRepository repository = new TaskRepository();
        repository.add(new Task("Wash dish", 4L));
        repository.add(new Task("Sweep floor", 12L));
        repository.add(new Task("Deliver stationeries", 24L));
        repository.add(new Task("Book ride", 16L));
        repository.add(new Task("Take out trash", 13L));
        return repository;
    }
}
