package com.astra.pos.controller;

import com.astra.pos.model.MstItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Item")
public class MstItemController {

    @RequestMapping("/")
    public ModelAndView getAllItem(@ModelAttribute MstItem mstItem) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mstItem");
        return mv;
    }


}
