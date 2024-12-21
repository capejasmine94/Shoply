package com.shoply.admin.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class PageController {


    @GetMapping("")
    public String adminLogin() {
        return "admin/adminLogin";
    }

    @GetMapping("adminRegister")
    public String adminRegister() {
        return "admin/adminRegister";
    }

    @GetMapping("adminRegisterComplete")
    public String adminRegisterComplete() {
        return "admin/adminRegisterComplete";
    }

    @PostMapping("adminHome")
    public String adminHome() {
        return "admin/adminHome";
    }

}
