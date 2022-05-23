package com.io.github.rafaelsouuza.dscatalog.repositories;

import com.io.github.rafaelsouuza.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
