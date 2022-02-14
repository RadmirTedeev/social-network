package com.example.socialnetwork.repo;

import com.example.socialnetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
