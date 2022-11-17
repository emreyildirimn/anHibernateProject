package com.JpaTraining.JpaTraining.business.objectmapping.mapstruct;

import com.JpaTraining.JpaTraining.business.request.category.CategoryCreateRequest;
import com.JpaTraining.JpaTraining.entities.concretes.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CategoryCreateMapstructMapper implements MapStructMapper<CategoryCreateRequest, Category> {
}
