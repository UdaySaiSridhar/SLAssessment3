package com.webshoe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webshoe.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select u from User u where u.userName=:userName")
	Optional<User> findUserByName(@Param("userName")String userName);
}
