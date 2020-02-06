package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // I return Apiservice to get User
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // I use apiService to generate a RandomUser
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        //I use apiService to delete a User
        apiService.deleteUser(user);
    }
}
