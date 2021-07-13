package com.master.project.controller;

import com.master.project.bean.UserBean;
import com.master.project.dao.services.UserService;
import com.master.project.model.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody @Valid UserBean user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@RequestParam("id") String id){
        return ResponseEntity.ok(userService.get(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@RequestParam("id") String id){
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestParam("id") String id, @RequestBody @Valid UserBean user){
        return ResponseEntity.ok(userService.update(id, user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.listAll());
    }
}
