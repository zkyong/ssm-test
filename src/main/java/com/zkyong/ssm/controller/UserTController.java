package com.zkyong.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkyong.ssm.model.UserT;
import com.zkyong.ssm.service.UserTService;

@Controller
@RequestMapping("/user")
public class UserTController {

    @Autowired
    private UserTService userTService;  

    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        UserT user = this.userTService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    } 
}