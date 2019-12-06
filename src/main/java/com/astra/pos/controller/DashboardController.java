package com.astra.pos.controller;

import com.astra.pos.repository.TPurchaseOrderRepository;
import com.astra.pos.repository.TTransferStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Dashboard")
public class DashboardController {

    @Autowired
    TTransferStockRepository transferStockRepository;

    @Autowired
    TPurchaseOrderRepository purchaseOrderRepository;

    @RequestMapping("/")
    public ModelAndView getDashboard() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("transferStocks", transferStockRepository.countTransferStock());
        mv.addObject("purchaseOrder", purchaseOrderRepository.countPurchaseOrder());
        mv.setViewName("dashboard");
        return mv;
    }

}
