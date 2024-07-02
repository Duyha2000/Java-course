package session15.business;

import session15.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryBusiness implements ICategoryDesign {
    public static List<Category> categories = new ArrayList<>();

    @Override
    public boolean updateStatus(Category category, boolean status) {
        Category existingCategory = findById(category.getCatalogId());
        if (existingCategory == null) return false;
        existingCategory.setCatalogStatus(status);
        return true;
    }

    @Override
    public boolean create(Category category) {
        return categories.add(category);
    }

    @Override
    public boolean update(Category category) {
        Category existingCategory = findById(category.getCatalogId());
        if (existingCategory == null) return false;
        int index = categories.indexOf(existingCategory);
        categories.set(index, category);
        return true;
    }

    @Override
    public boolean deleteById(Integer id) {
        return categories.removeIf(category -> category.getCatalogId() == id);
    }

    @Override
    public Category findById(Integer id) {
        return categories.stream()
                .filter(category -> category.getCatalogId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Category> findAll() {
        return categories;
    }
}
