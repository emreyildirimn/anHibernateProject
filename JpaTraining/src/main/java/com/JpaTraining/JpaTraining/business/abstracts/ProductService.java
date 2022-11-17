package com.JpaTraining.JpaTraining.business.abstracts;

import com.JpaTraining.JpaTraining.business.request.product.ProductCreateRequest;
import com.JpaTraining.JpaTraining.business.response.product.ProductGetJoinedResponse;

import java.util.List;

public interface ProductService {
    List<ProductGetJoinedResponse> getAll();

    void add(ProductCreateRequest productCreateRequest);

    void deleteById(int productId);

}
