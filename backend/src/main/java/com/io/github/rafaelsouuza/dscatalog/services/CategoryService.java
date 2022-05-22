package com.io.github.rafaelsouuza.dscatalog.services;

import com.io.github.rafaelsouuza.dscatalog.dto.CategoryDTO;
import com.io.github.rafaelsouuza.dscatalog.entities.Category;
import com.io.github.rafaelsouuza.dscatalog.repositories.CategoryRepository;
import com.io.github.rafaelsouuza.dscatalog.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = categoryRepository.findAll();
        return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new CategoryDTO(entity);
    }
}
