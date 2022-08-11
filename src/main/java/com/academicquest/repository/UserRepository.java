package com.academicquest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academicquest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

   User findByEmail(String email);
   
   List<User> findByIdIn(List<Long> listId);

}
