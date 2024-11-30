package in.kodder.service;

import in.kodder.model.Category;

import java.util.List;

public interface CategoryService{
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);
}
