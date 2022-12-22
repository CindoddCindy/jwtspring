package com.springjwt.jwtspring.repository;

import com.springjwt.jwtspring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByFirstname(String firstname);

  Boolean existsByFirstName(String firstname);

  Boolean existsByEmail(String email);
}
