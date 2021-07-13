package com.master.project.dao.services;

import com.master.project.bean.UserBean;
import com.master.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User create(UserBean user);

    User get(String id);

    void delete(String id);

    User update(String id, UserBean user);

    List<User> listAll();
}
