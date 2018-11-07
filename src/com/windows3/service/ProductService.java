package com.windows3.service;

import com.windows3.po.Product;

import java.util.List;

/**
 * Created by 3 on 2018/3/1.
 */
public interface ProductService {
    Product queryProductById(int pid);

    List<Product> queryAllProduct();

    boolean addProduct(Product product);
}
