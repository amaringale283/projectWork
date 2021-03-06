package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query("select u from User u where u.username = ?1 and password = ?2")
	public User findUser(String username, String password);
	
}
