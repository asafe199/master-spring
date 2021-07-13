package com.master.project.controller;

import com.master.project.bean.UserBean;
import com.master.project.dao.services.UserService;
import com.master.project.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api(
        value = "Controller for User", tags = "User",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class UserController {

    private final UserService userService;

    @PostMapping
    @ApiResponses({
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation(value = "Create a new User", response = User.class, code = 201)
    public ResponseEntity<User> create(@RequestBody @Valid UserBean user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Return a User by id", response = User.class)
    public ResponseEntity<User> get(@PathVariable("id") String id){
        return ResponseEntity.ok(userService.get(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a User by id")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a User", response = User.class)
    public ResponseEntity<User> update(@PathVariable("id") String id, @RequestBody @Valid UserBean user){
        return ResponseEntity.ok(userService.update(id, user));
    }

    @GetMapping
    @ApiOperation(value = "List all User's", response = User.class)
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.listAll());
    }
}
