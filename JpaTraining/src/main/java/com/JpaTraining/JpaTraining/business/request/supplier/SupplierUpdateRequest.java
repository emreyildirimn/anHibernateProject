package com.JpaTraining.JpaTraining.business.request.supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierUpdateRequest {

    private int supplierId;

    private String supplierName;

}
