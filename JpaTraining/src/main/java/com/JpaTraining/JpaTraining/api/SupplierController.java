package com.JpaTraining.JpaTraining.api;

import com.JpaTraining.JpaTraining.business.abstracts.SupplierService;
import com.JpaTraining.JpaTraining.business.request.supplier.SupplierCreateRequest;
import com.JpaTraining.JpaTraining.business.request.supplier.SupplierUpdateRequest;
import com.JpaTraining.JpaTraining.business.response.supplier.SupplierGetJoinedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;

    @GetMapping("/getAll")
    public List<SupplierGetJoinedResponse> getAll() {
        return supplierService.getAll();
    }

    @PostMapping("/save")
    public void save(SupplierCreateRequest supplier) {
        supplierService.add(supplier);
    }

    @PostMapping("/delete")
    public void deleteById(int supplierId) {
        supplierService.deleteById(supplierId);
    }

    @PostMapping("/update")
    public void updateById(SupplierUpdateRequest supplier) {
        supplierService.update(supplier);
    }

}
