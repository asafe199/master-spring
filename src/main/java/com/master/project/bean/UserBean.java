package com.master.project.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean implements Serializable {
    private String id;
    @NotEmpty(message = "name can't be empty")
    private String name;
    @NotEmpty(message = "email can't be empty")
    private String email;
    @NotEmpty(message = "lastName can't be empty")
    private String lastName;
    @NotEmpty(message = "password can't be empty")
    private String password;
}
