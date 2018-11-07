package com.windows3.test;


import com.windows3.po.Customer;
import com.windows3.po.Product;
import com.windows3.service.CustomerService;
import com.windows3.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by 3 on 2018/3/7.
 * ----------------The heart withered--------
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        Product product=new Product();
        product.setProductName("1");
        product.setProductType("12");
        product.setProductPrice(new BigDecimal(12));
        boolean b = productService.addProduct(product);
        System.out.println(b);
    }
}
