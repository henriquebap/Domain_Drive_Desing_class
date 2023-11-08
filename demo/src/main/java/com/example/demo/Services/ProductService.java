package com.example.demo.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.Department;
import com.example.demo.Products;
import java.util.List;

@Service
public class ProductService {

    List<Products> listOfProducts = new ArrayList<>();

    public List<Products> getAllProducts(){
        Department d1 = new Department(1, "Tech");
        Department d2 = new Department(2, "Pet");
        //Department d3 = new Department(3, "None");


        Products p1 = new Products(1l, "MacBook", 6000.0f, d1);
        Products p2 = new Products(2l, "Gatinho", 200f, d2);


        listOfProducts.add(p1);
        listOfProducts.add(p2);
        
        return listOfProducts;
    }

    public Products getProducts(int id){
        if(listOfProducts.get(id) != null){
            return listOfProducts.get(id);
        }
        return null;
    }
    
}
