package com.JpaTraining.JpaTraining.business.request.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateRequest {

    private String productName;

    private int categoryId;

    private int supplierId;

    private double unitPrice;

    private int unitsInStock;

}
