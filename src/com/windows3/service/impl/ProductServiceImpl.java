package com.windows3.service.impl;

import com.windows3.dao.ProductDao;
import com.windows3.po.Product;
import com.windows3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/9.
 * ----------------The heart withered--------
 */
@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product queryProductById(int pid) {
        return null;
    }

    @Override
    public List<Product> queryAllProduct() {
        return productDao.queryallProduct();
    }

    @Override
    public boolean addProduct(Product product) {
        return productDao.addProduct(product);
    }
}
