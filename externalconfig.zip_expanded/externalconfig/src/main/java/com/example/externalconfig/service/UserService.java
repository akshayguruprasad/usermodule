package com.example.externalconfig.service;

import com.example.externalconfig.model.UserEntity;

public interface UserService {

	void createUser(UserEntity user);

	UserEntity getUser(String id);

	void deleteUser(String id);

	void updateUser(UserEntity user);
}
