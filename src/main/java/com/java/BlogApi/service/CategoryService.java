package com.java.BlogApi.service;

import com.java.BlogApi.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category updateCategory(Category category);
    void deleteCategory(Long id);
}
