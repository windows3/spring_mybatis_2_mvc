package com.windows3.controller;

import com.windows3.po.Admin;
import com.windows3.po.Product;
import com.windows3.service.AdminService;
import com.windows3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 3 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/login.view")
    public   String  login(){

        return "admin/login";
    }
    @RequestMapping(value = "/login.do")
    public   String  loginAdmin(@ModelAttribute Admin admin,Model model){
        Admin login = adminService.login(admin);
        if(login!=null){
            List<Product> products = productService.queryAllProduct();
            model.addAttribute("products",products);
            model.addAttribute("info",admin.getAdminName());
            return "admin/success";
        }
        model.addAttribute("info","µÇÂ¼Ê§°Ü");
        return "admin/login";
    }
}
