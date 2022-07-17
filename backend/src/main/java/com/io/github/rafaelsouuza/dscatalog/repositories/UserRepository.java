package com.io.github.rafaelsouuza.dscatalog.repositories;

import com.io.github.rafaelsouuza.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
