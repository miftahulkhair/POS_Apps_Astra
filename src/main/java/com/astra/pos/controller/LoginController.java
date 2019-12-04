package com.astra.pos.controller;

import com.astra.pos.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/session_login")
    public String loginRegis(Model model){
        return "login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestParam String username, String password)
    {
        boolean result = loginService.checkLogin(username, password);
        System.out.println("result: " + result);
        return result ? "redirect:/Dashboard/" : "/Login/session_login";
    }



//    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
//    public ModelAndView welcomePage() {
//        ModelAndView model = new ModelAndView();
//        model.setViewName("login");
//        return model;
//    }
//
//    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
//    public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
//                                  @RequestParam(value = "logout",	required = false) String logout) {
//
//        ModelAndView model = new ModelAndView();
//        if (error != null) {
//            model.addObject("error", "Invalid Credentials provided.");
//        }
//
//        if (logout != null) {
//            model.addObject("message", "Logged out from JournalDEV successfully.");
//        }
//
//        model.setViewName("login");
//        return model;
//    }
}
