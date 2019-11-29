package com.astra.pos.controller;

import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;
import com.astra.pos.service.AssInventoryService;
import com.astra.pos.service.MstItemService;
import com.astra.pos.service.MstVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Item")
public class MstItemController {

    @Autowired
    MstItemService mstItemService;

    @Autowired
    MstVariantService mstVariantService;

    @Autowired
    AssInventoryService assInventoryService;

    @RequestMapping("/")
    public ModelAndView getAllItem(@ModelAttribute MstItem mstItem) {
        ModelAndView mv = new ModelAndView("mstItem");
        List<MstItem> items = mstItemService.getAllItem();
        mv.addObject("allItem", items);
        mv.addObject("supp", new  MstItem());

        List<AssItemInventory> inventories = assInventoryService.getAllInventory();
        mv.addObject("allInventory", inventories);

        List<MstVariant> variants = mstVariantService.getAllVariant();
//        Map<Long, String> variant = new HashMap<>();
//        for (MstVariant curVariant : variants){
//            variant.put(curVariant.getId(), curVariant.getName());
//        }

        mv.addObject("variant", variants);
        return mv;
    }

    @RequestMapping(value = "/edit_form", method = RequestMethod.GET)
    public ModelAndView editForm(@RequestParam long id){
        ModelAndView mv = new ModelAndView("mstItem");
        MstVariant variant = mstVariantService.getVariant(id);
        mv.addObject("mode", "MODE_UPDATE");
        mv.addObject("editItem", variant);
        return mv;
    }

    @RequestMapping(value = "/save-supplier", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute("sup") MstVariant supplier){
        ModelAndView mv = new ModelAndView("redirect:/Supplier/");
        mstVariantService.saveVariant(supplier);
        return mv;
    }
}
