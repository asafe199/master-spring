package com.master.project.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean implements Serializable {
    private String id;
    @NotEmpty(message = "Name can't be empty")
    private String name;
    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Email must be valid")
    private String email;
    @NotEmpty(message = "LastName can't be empty")
    private String lastName;
    @NotEmpty(message = "Password can't be empty")
    private String password;
}
