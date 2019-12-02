package com.astra.pos.controller;

import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;
import com.astra.pos.service.MstItemExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Item")
public class MstItemExtController {
    @Autowired
    MstItemExtService mstItemExtService;

    //    delete
    @RequestMapping(value="/deactivate/{id}", method = RequestMethod.GET)
    public String deactivateCategory(@PathVariable long id){
        MstVariant mstVariant = mstItemExtService.findOneVariant(id);
        mstVariant.setActive(false);
        mstItemExtService.saveOrUpdateVariant(mstVariant);
        return "redirect:/outlet";
    }

    @RequestMapping(value="/editVariant/{id}" , method = RequestMethod.GET)
    public @ResponseBody
    MstVariant getVariant(@PathVariable Long id) {
        MstVariant variant = mstItemExtService.findOneVariant(id);
        return variant;
    }

    @RequestMapping(value="/editItem/{id}" , method = RequestMethod.GET)
    public @ResponseBody
    MstItem getItem(@PathVariable Long id) {
        MstItem item = mstItemExtService.findOneItem(id);
        return item;
    }

    @RequestMapping(value="/editSaveVariant",method = RequestMethod.POST)
    public String saveUpdateVariant(@ModelAttribute("variant") MstVariant mstVariant){
        mstItemExtService.saveOrUpdateVariant(mstVariant);
        return "redirect:/viewoutlets";
    }

    @RequestMapping("/viewitem")
    public ModelAndView getInventories()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("inventories", mstItemExtService.findAllInvent());
        mv.setViewName("mstItem");
        return mv;
    }
}
