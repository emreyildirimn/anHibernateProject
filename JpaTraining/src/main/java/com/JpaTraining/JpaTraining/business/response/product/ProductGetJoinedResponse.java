package com.JpaTraining.JpaTraining.business.response.product;

import com.JpaTraining.JpaTraining.business.response.category.CategoryGetResponse;
import com.JpaTraining.JpaTraining.business.response.supplier.SupplierGetResponse;

public interface ProductGetJoinedResponse {

    int productId();

    String getProductName();

    CategoryGetResponse getCategory();

    SupplierGetResponse getSupplier();

    double getUnitPrice();

    int getUnitsInStock();

}
