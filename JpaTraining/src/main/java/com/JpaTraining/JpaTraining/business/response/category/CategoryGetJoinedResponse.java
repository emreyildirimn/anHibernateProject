package com.JpaTraining.JpaTraining.business.response.category;

import com.JpaTraining.JpaTraining.business.response.product.ProductGetResponse;

import java.util.List;

public interface CategoryGetJoinedResponse {

    int getCategoryId();

    String getCategoryName();

    List<ProductGetResponse> getProducts();

}
