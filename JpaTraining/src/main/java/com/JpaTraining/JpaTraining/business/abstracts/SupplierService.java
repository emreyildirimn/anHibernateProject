package com.JpaTraining.JpaTraining.business.abstracts;

import com.JpaTraining.JpaTraining.business.request.supplier.SupplierCreateRequest;
import com.JpaTraining.JpaTraining.business.request.supplier.SupplierUpdateRequest;
import com.JpaTraining.JpaTraining.business.response.supplier.SupplierGetJoinedResponse;

import java.util.List;

public interface SupplierService {
    List<SupplierGetJoinedResponse> getAll();

    void add(SupplierCreateRequest supplierCreateRequest);

    void deleteById(int supplierId);

    void update(SupplierUpdateRequest supplierUpdateRequest);
}
