package com.example.springdemo.Repository;

import com.example.springdemo.Model.UserModel;

public interface UserRepository {

	UserModel findByEmail(String email);

}
