package com.examle.multi.repository2;

import com.examle.multi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository2 extends JpaRepository<User,Long> {
}
