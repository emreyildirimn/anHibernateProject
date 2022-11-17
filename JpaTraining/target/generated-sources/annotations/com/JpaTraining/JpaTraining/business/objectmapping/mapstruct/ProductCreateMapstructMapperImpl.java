package com.JpaTraining.JpaTraining.business.objectmapping.mapstruct;

import com.JpaTraining.JpaTraining.business.request.product.ProductCreateRequest;
import com.JpaTraining.JpaTraining.entities.concretes.Category;
import com.JpaTraining.JpaTraining.entities.concretes.Product;
import com.JpaTraining.JpaTraining.entities.concretes.Supplier;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-17T10:59:24+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class ProductCreateMapstructMapperImpl extends ProductCreateMapstructMapper {

    @Override
    public ProductCreateRequest mapReverse(Product destination) {
        if ( destination == null ) {
            return null;
        }

        ProductCreateRequest productCreateRequest = new ProductCreateRequest();

        Integer supplierId = destinationSupplierSupplierId( destination );
        if ( supplierId != null ) {
            productCreateRequest.setSupplierId( supplierId );
        }
        Integer categoryId = destinationCategoryCategoryId( destination );
        if ( categoryId != null ) {
            productCreateRequest.setCategoryId( categoryId );
        }
        productCreateRequest.setProductName( destination.getProductName() );
        productCreateRequest.setUnitPrice( destination.getUnitPrice() );
        productCreateRequest.setUnitsInStock( destination.getUnitsInStock() );

        return productCreateRequest;
    }

    @Override
    public Product map(ProductCreateRequest source) {
        if ( source == null ) {
            return null;
        }

        Product product = new Product();

        product.setSupplier( productCreateRequestToSupplier( source ) );
        product.setCategory( productCreateRequestToCategory( source ) );
        product.setProductName( source.getProductName() );
        product.setUnitPrice( source.getUnitPrice() );
        product.setUnitsInStock( source.getUnitsInStock() );

        return product;
    }

    private Integer destinationSupplierSupplierId(Product product) {
        if ( product == null ) {
            return null;
        }
        Supplier supplier = product.getSupplier();
        if ( supplier == null ) {
            return null;
        }
        Integer supplierId = supplier.getSupplierId();
        if ( supplierId == null ) {
            return null;
        }
        return supplierId;
    }

    private Integer destinationCategoryCategoryId(Product product) {
        if ( product == null ) {
            return null;
        }
        Category category = product.getCategory();
        if ( category == null ) {
            return null;
        }
        Integer categoryId = category.getCategoryId();
        if ( categoryId == null ) {
            return null;
        }
        return categoryId;
    }

    protected Supplier productCreateRequestToSupplier(ProductCreateRequest productCreateRequest) {
        if ( productCreateRequest == null ) {
            return null;
        }

        Supplier supplier = new Supplier();

        supplier.setSupplierId( productCreateRequest.getSupplierId() );

        return supplier;
    }

    protected Category productCreateRequestToCategory(ProductCreateRequest productCreateRequest) {
        if ( productCreateRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( productCreateRequest.getCategoryId() );

        return category;
    }
}
