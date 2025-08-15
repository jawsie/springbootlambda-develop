package com.springbootlambda.heisentechsolutions.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootlambda.heisentechsolutions.data.User;

@RestController
@RequestMapping("/api/v1/")
public class ProfileController {

  @GetMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<User> getUser() {
    return List.of(new User("nicholas", "linnear", "nicholas.linnear@gmail.com"),
        new User("Pradeep", "Kolapkar", "pradeepkolpkar@heisentech.com"));
  }

}