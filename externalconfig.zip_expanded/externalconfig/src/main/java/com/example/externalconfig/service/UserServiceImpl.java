package com.example.externalconfig.service;

import org.springframework.stereotype.Service;

import com.example.externalconfig.model.UserEntity;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired
//	MongoUserRepo userRepo;

	@Override
	public void createUser(UserEntity user) {
//		user = userRepo.save(user);
		System.out.println(user);

	}

	@Override
	public UserEntity getUser(String id) {
//		return userRepo.findById(id).orElse(null);
		return null;
	}

	@Override
	public void deleteUser(String id) {
//		userRepo.deleteById(id);

	}

	@Override
	public void updateUser(UserEntity user) {
//		user = userRepo.save(user);
		System.out.println(user);
	}

}
