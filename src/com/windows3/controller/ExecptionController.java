package com.windows3.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by 3 on 2018/3/9.
 * ----------------The heart withered--------
 */
@ControllerAdvice
public class ExecptionController {

    @ExceptionHandler
    public String error500(NullPointerException e) {
        return "redirect:/staticPages/500.html";

    }

}
