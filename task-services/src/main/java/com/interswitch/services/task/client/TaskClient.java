package com.interswitch.services.task.client;

import com.interswitch.services.task.models.Task;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee-service")
public interface TaskClient {
	@GetMapping("/employee/{employeeId}")
	List<Task> findByDepartment(@PathVariable("employeeId") Long employeeId);
	
}
