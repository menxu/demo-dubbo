package com.dubbo.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.servermodel.service.ProductService;
import com.dubbo.servermodel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Reference(check = true)
    private UserService userService;

    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Map index(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Integer _id = Integer.valueOf(id);
        String userView = userService.getDetail(_id);
        String productView = productService.getDetail(_id);

        Map map = new HashMap();
        map.put("userView", userView);
        map.put("productView", productView);

        System.out.println(map);

        return map;
    }
}
