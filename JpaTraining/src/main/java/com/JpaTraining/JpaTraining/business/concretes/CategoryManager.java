package com.JpaTraining.JpaTraining.business.concretes;

import com.JpaTraining.JpaTraining.business.abstracts.CategoryService;
import com.JpaTraining.JpaTraining.business.objectmapping.abstraction.Mapper;
import com.JpaTraining.JpaTraining.business.request.category.CategoryCreateRequest;
import com.JpaTraining.JpaTraining.business.request.category.CategoryUpdateRequest;
import com.JpaTraining.JpaTraining.business.response.category.CategoryGetJoinedResponse;
import com.JpaTraining.JpaTraining.dataAccess.abstracts.CategoryDao;
import com.JpaTraining.JpaTraining.entities.concretes.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryManager implements CategoryService {

    private final CategoryDao categoryDao;
    private final Mapper<CategoryCreateRequest, Category> categoryCreateMapper;

    @Override
    public List<CategoryGetJoinedResponse> getAll() {
        return categoryDao.findAllBy(CategoryGetJoinedResponse.class);
    }

    @Override
    public void add(CategoryCreateRequest categoryCreateRequest) {
        categoryDao.save(categoryCreateMapper.map(categoryCreateRequest));
    }

    @Override
    public void deleteById(int categoryId) {
        categoryDao.deleteById(categoryId);
    }

    @Override
    public void update(CategoryUpdateRequest categoryUpdateRequest) {
        Category categoryToUpdate = categoryDao.getReferenceById(categoryUpdateRequest.getCategoryId());
        categoryToUpdate.setCategoryName(categoryToUpdate.getCategoryName());
        categoryDao.save(categoryToUpdate);
    }

}
