package com.examle.multi.repository1;

import com.examle.multi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository1 extends JpaRepository<User,Long> {
}
