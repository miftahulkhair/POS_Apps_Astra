package com.astra.pos.controller;

import com.astra.pos.model.TPr;
import com.astra.pos.service.PurchaseRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("PurchaseRequest")
public class PrcsRequestController {
    @Autowired
    PurchaseRequestService purchaseRequestService;

    @Autowired
    AssInventoryService assInventoryService;

    @RequestMapping("/")
    public ModelAndView getAllPrcsRequest() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("purchaseRequest");
        List<TPr> prcsRequest = purchaseRequestService.getAllPurchaseRequest();
        mv.addObject("tpr", new TPr());
        mv.addObject("allPrcsRequest", prcsRequest);

//        List<AssItemInventory> inventories = assInventoryService.getAllInventory();
//        mv.addObject("allInventory", inventories);
        return mv;
    }

    @RequestMapping(value = "/edit_form", method = RequestMethod.GET)
    public ModelAndView editForm(@RequestParam long id){
        ModelAndView mv = new ModelAndView("purchaseRequest");
        TPr supplier = purchaseRequestService.getPurchaseRequest(id);
        mv.addObject("editSupplier", supplier);
        return mv;
    }

    @RequestMapping(value = "/save-update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("update") TPr tPr){
        ModelAndView mv = new ModelAndView("redirect:/PurchaseRequest/");
        purchaseRequestService.update(tPr);
        return mv;
    }

    @RequestMapping(value = "/saveUpdate-pr", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("sup") TPr tPr){
        ModelAndView mv = new ModelAndView("redirect:/PurchaseRequest/");
        purchaseRequestService.saveUpdate(tPr);
        return mv;
    }
}
