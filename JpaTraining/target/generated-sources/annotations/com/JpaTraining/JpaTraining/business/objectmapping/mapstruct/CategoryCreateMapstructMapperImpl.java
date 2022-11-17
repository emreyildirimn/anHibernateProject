package com.JpaTraining.JpaTraining.business.objectmapping.mapstruct;

import com.JpaTraining.JpaTraining.business.request.category.CategoryCreateRequest;
import com.JpaTraining.JpaTraining.entities.concretes.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-17T10:59:24+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class CategoryCreateMapstructMapperImpl extends CategoryCreateMapstructMapper {

    @Override
    public Category map(CategoryCreateRequest source) {
        if ( source == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryName( source.getCategoryName() );

        return category;
    }

    @Override
    public CategoryCreateRequest mapReverse(Category destination) {
        if ( destination == null ) {
            return null;
        }

        CategoryCreateRequest categoryCreateRequest = new CategoryCreateRequest();

        categoryCreateRequest.setCategoryName( destination.getCategoryName() );

        return categoryCreateRequest;
    }
}
