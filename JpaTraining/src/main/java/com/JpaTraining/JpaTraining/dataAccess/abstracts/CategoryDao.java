package com.JpaTraining.JpaTraining.dataAccess.abstracts;

import com.JpaTraining.JpaTraining.entities.concretes.Category;

public interface CategoryDao extends JpaRepositoryAdapter<Category, Integer> {

    <T> T getByCategoryId(int categoryId, Class<T> projection);

}
