package com.astra.pos.controller;

import com.astra.pos.model.*;
import com.astra.pos.service.MstItemExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
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

//    indexing
//    @RequestMapping(value = "/viewitems")
//    public String indexLocation (@ModelAttribute MstVariant mstVariant, Model model){
//        //Item Variant data
//        List<MstVariant> list = mstItemExtService.findAllVariant();
//        model.addAttribute("variants", list );
//        //Category
//        List<MstCategory> categories = locationService.findAllProvince();
//        Map<Long, String> province = new HashMap<>();
//        for (MstProvince curProvince : provinces){
//            province.put(curProvince.getId(), curProvince.getName());
//        }
//
//        List<MstRegion> regions = locationService.findAllRegion();
//        Map<Long, String> region = new HashMap<>();
//        for (MstRegion curRegion : regions){
//            region.put(curRegion.getId(), curRegion.getName());
//        }
//
//        List<MstDistrict> districts = locationService.findAllDistrict();
//        Map<Long, String> district = new HashMap<>();
//        for (MstDistrict curDistrict : districts){
//            district.put(curDistrict.getId(), curDistrict.getName());
//        }
//
//        model.addAttribute("outlet", new MstOutlet());
//        model.addAttribute("province", province);
//        model.addAttribute("region", region);
//        model.addAttribute("district",district);
//        return "mstItem";
//
//
//
//
//    }
    @RequestMapping("/viewitem")
    public ModelAndView getInventories()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("inventories", mstItemExtService.findAllInvent());
        mv.setViewName("mstItem");
        return mv;
    }
}
