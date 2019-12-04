package com.astra.pos.controller;

import com.astra.pos.model.TPrcsRequest;
import com.astra.pos.service.MstItemExtService;
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
    MstItemExtService mstItemExtService;

    @RequestMapping("/")
    public ModelAndView getAllPrcsRequest() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("purchaseRequest");
        List<TPrcsRequest> prcsRequest = purchaseRequestService.getAllPurchaseRequest();
        mv.addObject("tpr", new TPrcsRequest());
        mv.addObject("allPrcsRequest", prcsRequest);

        return mv;
    }

    @RequestMapping(value = "/edit_form", method = RequestMethod.GET)
    public ModelAndView editForm(@RequestParam long id){
        ModelAndView mv = new ModelAndView("purchaseRequest");
        TPrcsRequest supplier = purchaseRequestService.getPurchaseRequest(id);
        mv.addObject("editSupplier", supplier);
        return mv;
    }

    @RequestMapping(value = "/save-update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("update") TPrcsRequest tPrcsRequest){
        ModelAndView mv = new ModelAndView("redirect:/PurchaseRequest/");
        purchaseRequestService.update(tPrcsRequest);
        return mv;
    }

    @RequestMapping(value = "/saveUpdate-pr", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("sup") TPrcsRequest tPrcsRequest){
        ModelAndView mv = new ModelAndView("redirect:/PurchaseRequest/");
        purchaseRequestService.saveUpdate(tPrcsRequest);
        return mv;
    }
}
