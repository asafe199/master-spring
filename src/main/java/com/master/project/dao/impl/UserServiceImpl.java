package com.master.project.dao.impl;

import com.master.project.bean.UserBean;
import com.master.project.config.exception.ResultNotFoundException;
import com.master.project.dao.respository.UserRespository;
import com.master.project.dao.services.UserService;
import com.master.project.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRespository userRespository;

    @Override
    public User create(UserBean user) {
        return userRespository.save(new User(null, user.getName(), user.getEmail(), user.getLastName(), user.getPassword()));
    }

    @Override
    public User get(String id) {
        Optional<User> userOptional = Optional.of(userRespository.findById(id)).orElseThrow(ResultNotFoundException::new);
        return userOptional.get();
    }

    @Override
    public void delete(String id) {
        var user = get(id);
        userRespository.delete(user);
    }

    @Override
    public User update(String id, UserBean user) {
        var userById = get(id);
        return userRespository.save(userById);
    }

    @Override
    public List<User> listAll() {
        return userRespository.findAll();
    }
}
