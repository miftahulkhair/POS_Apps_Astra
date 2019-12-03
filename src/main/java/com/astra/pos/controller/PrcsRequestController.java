package com.astra.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("PurchaseRequest")
public class PrcsRequestController {

    @RequestMapping("/")
    public ModelAndView getAllItem() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("purchaseRequest");
        return mv;
    }
}
