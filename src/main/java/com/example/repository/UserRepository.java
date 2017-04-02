package com.example.repository;

import com.example.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zsj on 2017/3/20.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsername(String username);
}
