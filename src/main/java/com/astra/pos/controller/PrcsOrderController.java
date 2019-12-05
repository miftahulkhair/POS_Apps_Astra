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
        List<TPrcsOrderDetail> poDetail = purchaseOrderService.getAllPODetail();

        List<MstSupplier> suppliers = mstSupplierService.getAllSupplier();
        Map<Long, String> supplier = new HashMap<>();
        for (MstSupplier curSupplier : suppliers){
            supplier.put(curSupplier.getId(), curSupplier.getName());
        }

        mv.addObject("poDetail", poDetail);
        mv.addObject("inventories", mstItemExtService.findAllInvent());
        mv.addObject("PO", new TPrcsOrder());
        mv.addObject("PODetail", new TPrcsOrderDetail());
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

    @RequestMapping(value="/edit_formDetail/{id}" , method = RequestMethod.GET)
    public @ResponseBody
    TPrcsOrderDetail getPODetail(@PathVariable Long id) {
        TPrcsOrderDetail po = purchaseOrderService.getPODetail(id);
        System.out.println(po.getId());
        return po;
    }

    @RequestMapping(value = "/update-po", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("PO") TPrcsOrder tPrcsOrder){
        ModelAndView mv = new ModelAndView("redirect:/PurchaseOrder/");
        purchaseOrderService.update(tPrcsOrder);
        return mv;
    }
    @RequestMapping(value = "/update-po-dtl", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("PO") TPrcsOrderDetail tPrcsOrderDetail){
        ModelAndView mv = new ModelAndView("redirect:/PurchaseOrder/");
        purchaseOrderService.updatePODetail(tPrcsOrderDetail);
        return mv;
    }
}
