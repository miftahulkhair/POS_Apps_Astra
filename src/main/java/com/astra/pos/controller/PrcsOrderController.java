package com.astra.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("PurchaseOrder")
public class PrcsOrderController {
    @RequestMapping("/")
    public ModelAndView getAllPrcsOrder() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("purchaseOrder");
        return mv;
    }
}
