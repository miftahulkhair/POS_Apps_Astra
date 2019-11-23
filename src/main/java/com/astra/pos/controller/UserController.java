package com.astra.pos.controller;

import com.astra.pos.repository.MstUserRepository;
import com.astra.pos.service.MstUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

//    @Autowired
//    MstUserRepository mstUserRepository;

    @Autowired
    MstUserService mstUserService;

    @RequestMapping("/employees")
    public ModelAndView getUsers()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", mstUserService.findAll());
        mv.setViewName("employee");

        return mv;
    }
}
