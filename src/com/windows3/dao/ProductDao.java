package com.windows3.dao;

import com.windows3.po.Product;

import java.util.List;

/**
 * Created by 3 on 2018/3/1.
 */
public interface ProductDao {

    Product  queryProductById(int pid);
     List<Product> queryallProduct();

    boolean addProduct(Product product);
}
