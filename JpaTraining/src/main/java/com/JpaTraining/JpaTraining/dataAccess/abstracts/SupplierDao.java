package com.JpaTraining.JpaTraining.dataAccess.abstracts;

import com.JpaTraining.JpaTraining.entities.concretes.Supplier;

public interface SupplierDao extends JpaRepositoryAdapter<Supplier, Integer> {
    Supplier getBySupplierId(int supplierId);
}