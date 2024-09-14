package com.demo.EVotingSystem.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.EVotingSystem.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	Optional<User> findByName(String userName);

}
