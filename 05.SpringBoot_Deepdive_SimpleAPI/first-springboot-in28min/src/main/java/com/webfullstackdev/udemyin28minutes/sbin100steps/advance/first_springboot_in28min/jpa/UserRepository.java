package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByRole(String role);
}
