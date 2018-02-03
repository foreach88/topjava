package com.topjava.service;

import com.topjava.model.User;
import com.topjava.repository.UserRepository;
import com.topjava.util.exception.NotFoundException;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) throws NotFoundException {

    }
}
