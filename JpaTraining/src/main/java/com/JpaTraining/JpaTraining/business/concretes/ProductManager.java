package com.JpaTraining.JpaTraining.business.concretes;

import com.JpaTraining.JpaTraining.business.abstracts.ProductService;
import com.JpaTraining.JpaTraining.business.objectmapping.abstraction.Mapper;
import com.JpaTraining.JpaTraining.business.request.product.ProductCreateRequest;
import com.JpaTraining.JpaTraining.business.response.product.ProductGetJoinedResponse;
import com.JpaTraining.JpaTraining.dataAccess.abstracts.ProductDao;
import com.JpaTraining.JpaTraining.entities.concretes.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {

    private final ProductDao productDao;
    private final Mapper<ProductCreateRequest, Product> productCreateMapper;

    @Override
    public List<ProductGetJoinedResponse> getAll() {
        return productDao.findAllBy(ProductGetJoinedResponse.class);
    }

    @Override
    public void add(ProductCreateRequest productCreateRequest) {
        productDao.save(productCreateMapper.map(productCreateRequest));
    }

    @Override
    public void deleteById(int productId) {
        productDao.deleteById(productId);
    }


}
