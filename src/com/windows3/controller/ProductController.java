package com.windows3.controller;

import com.windows3.po.Product;
import com.windows3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by 3 on 2018/3/8.
 * ----------------The heart withered--------
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/allproduct")
    public @ResponseBody List<Product> getProducts() {
        return productService.queryAllProduct();

    }

    @RequestMapping(value = "/add.view")
    public String addProduct() {
        return "/product/register";


    }

    @RequestMapping(value = "/add.do")
    public String addProduct(Product product, Model model) {
        boolean b = productService.addProduct(product);
        if (b) {
           model.addAttribute("info","增加成功");
            return "/product/register";
        }
        model.addAttribute("info","增加失败");
        return "/product/register";
    }

}
