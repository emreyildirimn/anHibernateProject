package com.JpaTraining.JpaTraining.api;

import com.JpaTraining.JpaTraining.business.abstracts.ProductService;
import com.JpaTraining.JpaTraining.business.request.product.ProductCreateRequest;
import com.JpaTraining.JpaTraining.business.response.product.ProductGetJoinedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductService productService;

    @GetMapping("/getAll")
    public List<ProductGetJoinedResponse> getAll() {
        return productService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody ProductCreateRequest product) {
        productService.add(product);

    }

    @PostMapping("/delete")
    public void deleteById(int productId) {
        productService.deleteById(productId);
    }


}
