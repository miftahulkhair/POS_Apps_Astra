package com.astra.pos.controller;

import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;
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
@RequestMapping("/Item")
public class MstItemExtController {
    @Autowired
    MstItemExtService mstItemExtService;

    //    delete
    @RequestMapping(value="/deactivate/{id}", method = RequestMethod.POST)
    public String deactivateVariant(@PathVariable long id){
        MstVariant mstVariant = mstItemExtService.findOneVariant(id);
        mstVariant.setActive(false);
        mstItemExtService.saveOrUpdateVariant(mstVariant);
        return "mstItem";
    }

    //buat ngetest
//    @RequestMapping(value="/listVariant_item/{id}" , method = RequestMethod.GET)
//    public @ResponseBody
//    List<MstVariant> getVariant(@PathVariable Long id) {
//        List<MstVariant> variant = mstItemExtService.findVariantByItem(id);
//        return variant;
//    }

    @RequestMapping(value="/listInvent/{id}" , method = RequestMethod.GET)
    public @ResponseBody
    List<AssItemInventory> getInventID(@PathVariable Long id) {
        List<AssItemInventory> invent = mstItemExtService.findInventByItem(id);
        return invent;
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
        return "redirect:/Item/viewoutlets";
    }

    @RequestMapping(value="/editSaveItem",method = RequestMethod.POST)
    public String saveUpdateItem(@ModelAttribute("item") MstItem mstItem){
        mstItemExtService.saveOrUpdateItem(mstItem);
        return "redirect:/Item/viewoutlets";
    }

    //    indexing
    @RequestMapping(value = "/viewitems")
    public String indexItem (@ModelAttribute AssItemInventory assItemInventory, MstItem mstItem, Model model){
        //Item Inventory data
        List<AssItemInventory> list = mstItemExtService.findAllInvent();
        model.addAttribute("inventories", list );
        //Category
        List<MstCategory> categories = mstItemExtService.findAllCategory();
        Map<Long, String> category = new HashMap<>();
        for (MstCategory curCategory : categories){
            category.put(curCategory.getId(), curCategory.getName());
        }
        model.addAttribute("item", new MstItem());
        model.addAttribute("inventory", new AssItemInventory());
        model.addAttribute("category", category);

        return "mstItem";

    }
    @RequestMapping("/viewinvetoryitem")
    public ModelAndView getInventories(Long id)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("inventoryitems", mstItemExtService.findInventByItem(id));
        mv.setViewName("tabelmodal");
        return mv;
    }

}
