package com.Learning.repository;


import com.Learning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by email
    User findByEmail(String email);

    // Find all users with a specific role
    List<User> findByRole(String role);
}
