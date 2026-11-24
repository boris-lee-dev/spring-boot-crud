package org.example.springbootcrudweb.springbootcrud.repository;

import org.example.springbootcrudweb.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}