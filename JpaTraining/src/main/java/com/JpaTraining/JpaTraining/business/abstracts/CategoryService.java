package com.JpaTraining.JpaTraining.business.abstracts;

import com.JpaTraining.JpaTraining.business.request.category.CategoryCreateRequest;
import com.JpaTraining.JpaTraining.business.request.category.CategoryUpdateRequest;
import com.JpaTraining.JpaTraining.business.response.category.CategoryGetJoinedResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryGetJoinedResponse> getAll();

    void add(CategoryCreateRequest categoryCreateRequest);

    void deleteById(int categoryId);

    void update(CategoryUpdateRequest categoryUpdateRequest);
}
