package com.erlan.task_service.service;

import com.erlan.task_service.model.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

//It's the name and link to our microservice  "task-user-service"
//change address
@FeignClient(name="USER-SERVICE", url = "http://localhost:8080")
public interface UserService {

    //We get from UserController of "task-user-service"
    @GetMapping("/api/users/profile")
    public UserDto getUserProfile(@RequestHeader("Authorization") String jwt);
}