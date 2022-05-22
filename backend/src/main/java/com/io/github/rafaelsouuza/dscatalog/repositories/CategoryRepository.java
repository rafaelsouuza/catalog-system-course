package com.io.github.rafaelsouuza.dscatalog.repositories;

import com.io.github.rafaelsouuza.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
