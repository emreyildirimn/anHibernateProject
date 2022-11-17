package com.JpaTraining.JpaTraining.api;

import com.JpaTraining.JpaTraining.business.abstracts.CategoryService;
import com.JpaTraining.JpaTraining.business.request.category.CategoryCreateRequest;
import com.JpaTraining.JpaTraining.business.request.category.CategoryUpdateRequest;
import com.JpaTraining.JpaTraining.business.response.category.CategoryGetJoinedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/getAll")
    public List<CategoryGetJoinedResponse> getAll() {
        return categoryService.getAll();
    }

    @PostMapping("/save")
    public void save(CategoryCreateRequest category) {
        categoryService.add(category);
    }

    @PostMapping("/delete")
    public void deleteById(int categoryId) {
        categoryService.deleteById(categoryId);
    }

    @PostMapping("/update")
    public void updateById(CategoryUpdateRequest category) {
        categoryService.update(category);
    }

}
