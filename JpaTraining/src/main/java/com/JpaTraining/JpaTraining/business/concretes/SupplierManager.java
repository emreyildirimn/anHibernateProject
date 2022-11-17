package com.JpaTraining.JpaTraining.business.concretes;

import com.JpaTraining.JpaTraining.business.abstracts.SupplierService;
import com.JpaTraining.JpaTraining.business.request.supplier.SupplierCreateRequest;
import com.JpaTraining.JpaTraining.business.request.supplier.SupplierUpdateRequest;
import com.JpaTraining.JpaTraining.business.response.supplier.SupplierGetJoinedResponse;
import com.JpaTraining.JpaTraining.dataAccess.abstracts.SupplierDao;
import com.JpaTraining.JpaTraining.entities.concretes.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierManager implements SupplierService {
    private final SupplierDao supplierDao;

    @Autowired
    public SupplierManager(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public List<SupplierGetJoinedResponse> getAll() {
        return supplierDao.findAllBy(SupplierGetJoinedResponse.class);
    }

    @Override
    public void add(SupplierCreateRequest supplierCreateRequest) {
        supplierDao.save(new Supplier(null, supplierCreateRequest.getSupplierName(), null));
    }

    @Override
    public void deleteById(int supplierId) {
        supplierDao.deleteById(supplierId);
    }

    @Override
    public void update(SupplierUpdateRequest supplierUpdateRequest) {
        Supplier supplierToUpdate = supplierDao.getReferenceById(supplierUpdateRequest.getSupplierId());
        supplierToUpdate.setSupplierName(supplierToUpdate.getSupplierName());
    }

}
