package com.example.FirstMS.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstMS.Model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
	
	Optional<List<User>> findByFirstName(String firstName);
    Optional<List<User>> findByFirstNameContainingIgnoreCase(String firstName);
    Optional<List<User>> findByAgeLessThan(int age);
}
