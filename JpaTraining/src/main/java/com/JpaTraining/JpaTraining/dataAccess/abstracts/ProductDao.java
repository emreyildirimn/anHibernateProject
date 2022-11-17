package com.JpaTraining.JpaTraining.dataAccess.abstracts;

import com.JpaTraining.JpaTraining.entities.concretes.Product;

import java.util.List;

public interface ProductDao extends JpaRepositoryAdapter<Product, Integer> {

    Product getByProductName(String productName);

    List<Product> getBySupplierSupplierNameAndCategoryCategoryName(String supplierName, String categoryName);
}
