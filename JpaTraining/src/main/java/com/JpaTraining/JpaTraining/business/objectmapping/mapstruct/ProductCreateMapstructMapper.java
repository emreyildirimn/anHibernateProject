package com.JpaTraining.JpaTraining.business.objectmapping.mapstruct;

import com.JpaTraining.JpaTraining.business.request.product.ProductCreateRequest;
import com.JpaTraining.JpaTraining.entities.concretes.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ProductCreateMapstructMapper implements MapStructMapper<ProductCreateRequest, Product> {

    @Mapping(target = "supplierId", source = "destination.supplier.supplierId")
    @Mapping(target = "categoryId", source = "destination.category.categoryId")
    public abstract ProductCreateRequest mapReverse(Product destination);

    @Mapping(target = "supplier.supplierId", source = "source.supplierId")
    @Mapping(target = "category.categoryId", source = "source.categoryId")
    public abstract Product map(ProductCreateRequest source);

}
