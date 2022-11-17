package com.JpaTraining.JpaTraining.business.response.supplier;

import com.JpaTraining.JpaTraining.business.response.product.ProductGetResponse;

import java.util.List;

public interface SupplierGetJoinedResponse {

    int getSupplierId();

    String getSupplierName();

    List<ProductGetResponse> getProducts();

}
