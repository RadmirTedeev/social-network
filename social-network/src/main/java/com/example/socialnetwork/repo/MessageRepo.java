package com.example.socialnetwork.repo;

import com.example.socialnetwork.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
