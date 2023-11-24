package com.momento.valorativo.jacoboh.repositories;

import com.momento.valorativo.jacoboh.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {
}
