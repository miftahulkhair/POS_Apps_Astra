package com.astra.pos.controller;

import com.astra.pos.model.*;
import com.astra.pos.service.MstItemExtService;
import com.astra.pos.service.MstSupplierService;
import com.astra.pos.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/PurchaseOrder")
public class PrcsOrderController {
    @Autowired
    PurchaseOrderService purchaseOrderService;

    @Autowired
    MstSupplierService mstSupplierService;

    @Autowired
    MstItemExtService mstItemExtService;

    @RequestMapping("/")
    public ModelAndView getAllPrcsOrder(@ModelAttribute TPrcsOrder tPrcsOrder) {
        ModelAndView mv = new ModelAndView("purchaseOrder");
        List<TPrcsOrder> po = purchaseOrderService.getAllPO();

        List<MstSupplier> suppliers = mstSupplierService.getAllSupplier();
        Map<Long, String> supplier = new HashMap<>();
        for (MstSupplier curSupplier : suppliers){
            supplier.put(curSupplier.getId(), curSupplier.getName());
        }

        mv.addObject("poDetail", purchaseOrderService.getAllPODetail());
        mv.addObject("inventories", mstItemExtService.findAllInvent());
        mv.addObject("PO", new TPrcsOrder());
        mv.addObject("supplier", supplier);
        mv.addObject("allPO", po);
        return mv;
    }

    @RequestMapping(value="/edit_form/{id}" , method = RequestMethod.GET)
    public @ResponseBody
    TPrcsOrder getPO(@PathVariable Long id) {
        TPrcsOrder po = purchaseOrderService.getPO(id);
        System.out.println(po.getId());
        return po;
    }

    @RequestMapping(value = "/update-po", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("PO") TPrcsOrder tPrcsOrder){
        ModelAndView mv = new ModelAndView("redirect:/Supplier/");
        purchaseOrderService.update(tPrcsOrder);
        return mv;
    }
}
