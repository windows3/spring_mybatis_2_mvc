package com.windows3.dao;

import com.windows3.po.ProductDetail;

/**
 * Created by 3 on 2018/3/1.
 */
public interface ProductDetailDao {
    ProductDetail findProductDetailById(int id);
    ProductDetail findProductDetailByPId(int pId);
}
