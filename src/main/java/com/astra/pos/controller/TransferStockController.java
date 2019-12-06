package com.astra.pos.controller;


import com.astra.pos.model.*;
import com.astra.pos.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class TransferStockController {

    @Autowired
    TTransferStockRepository transferStockRepository;

    @Autowired
    TTransferStockDetailRepository transferStockDetailRepository;

    @Autowired
    TTransferStockHistoryRepository transferStockHistoryRepository;

    @Autowired
    MstOutletRepository mstOutletRepository;

    @GetMapping("/transferStock")
    public ModelAndView getTransferStock()
    {
        ModelAndView mv = new ModelAndView();

        TTransferStock transferStk = new TTransferStock();
        TTransferStockDetail transferStockDtl = new TTransferStockDetail();

        List<MstOutlet> mstOutlets = mstOutletRepository.findAll();
        Map<Long, String> outlet = new HashMap<>();
        for (MstOutlet getOutlet : mstOutlets){
            outlet.put(getOutlet.getId(), getOutlet.getName());
        }


        System.out.println("TEST" + transferStockRepository.findAll());

        mv.addObject("outlets", outlet);
        mv.addObject("transferStocks", transferStockRepository.findAll());
        mv.addObject("transferStockDtl", transferStockDtl);
        mv.setViewName("transferStock");

        return mv;
    }

    @PostMapping("/transferStock/save")
    public ModelAndView createTransferStock(@ModelAttribute("transferStk") TTransferStockDetail transferStockDetail){
        ModelAndView mv = new ModelAndView("redirect:/transferStock");

        if(transferStockDetail.getTransfer().getFromOutlet() == transferStockDetail.getTransfer().getToOutlet()){
            System.out.println("From Outlet dan To Outlet tidak boleh sama");
        }else {
            transferStockDetail.getTransfer().setStatus("Submitted");
            transferStockDetail.setTransferQty(30);
            transferStockDetailRepository.save(transferStockDetail);
        }

        return mv;

    }




    @RequestMapping("/transferStock/detail/{id}")
    public ModelAndView viewDetails(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView();

        List<TTransferStockDetail> transferStockDetail = transferStockDetailRepository.findTTransferStockDetailByTransfer_id(id);

        List<TTransferStockHistory> transferStockHistory = transferStockHistoryRepository.findTTransferStockHistoryByTransfer_id(id);

        mv.addObject("transferStockDetails", transferStockDetail);
        mv.addObject("transferStockHistories", transferStockHistory);
        mv.addObject("transferStocks", transferStockRepository.findById(id));
        mv.setViewName("transferStockDetail");

        return mv;
    }

}
