package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Products;
import com.example.demo.Services.ProductService;


@RestController
@RequestMapping(value="/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
        
    }

    
    @RequestMapping("/{id}")
    public ResponseEntity<Products> getProductsId(@PathVariable("id") int id){
        Products products = productService.getProducts(id);
        if(products == null){
            return new ResponseEntity<Products>(HttpStatus.NOT_FOUND);
        }
        return null;
    }


}
