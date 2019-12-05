package com.astra.pos.controller;

import com.astra.pos.model.*;
import com.astra.pos.service.MstCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Category")
public class MstCategoryController {
    @Autowired
    MstCategoryService mstCategoryService;

    @RequestMapping("/")
    public ModelAndView getAllCategory(@ModelAttribute MstCategory mstCategory) {
        ModelAndView mv = new ModelAndView("mstCategory");
        List<MstCategory> category = mstCategoryService.getAllCategory();

        for (int i = 0; i < category.size(); i++){
            if (category.get(i).getActive()==false){
                category.remove(i);
            }
        }

        mv.addObject("allCategory", category);
        mv.addObject("cat", new MstCategory());
        mv.addObject("catt", new MstCategory());
        return mv;
    }

    @RequestMapping(value="/edit_form/{id}" , method = RequestMethod.GET)
    public @ResponseBody
    MstCategory getCategory(@PathVariable Long id) {
        MstCategory category = mstCategoryService.getCategory(id);
        System.out.println(category.getId());
        return category;
    }

    @RequestMapping(value="/tes" , method = RequestMethod.GET)
    public @ResponseBody
    List<MstCategory> getCattes() {
        List<MstCategory> category = mstCategoryService.getAllCategory();
        for (int i = 0; i <= category.size(); i++){
            if (category.get(i).getActive()==false){
                System.out.println(category.get(i).getId());
                category.remove(i);

            }
        }
        return category;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUpdate(@ModelAttribute("cat") MstCategory mstCategory) {
        mstCategory.setActive(true);
        mstCategoryService.saveUpdate(mstCategory);
        return "redirect:/Category/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String updateDel(@ModelAttribute("cat") MstCategory mstCategory) {
        mstCategory.setActive(false);
        mstCategoryService.saveUpdate(mstCategory);
        return "redirect:/Category/";
    }

}
