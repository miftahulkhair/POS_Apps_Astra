package com.astra.pos.controller;

import com.astra.pos.model.MstDistrict;
import com.astra.pos.model.MstProvince;
import com.astra.pos.model.MstRegion;
import com.astra.pos.model.MstSupplier;
import com.astra.pos.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Supplier")
public class MstSupplierController {
    @Autowired
    MstSupplierService mstSupplierService;

    @Autowired
    LocationService locationService;

    @RequestMapping("/")
    public ModelAndView getAllSupplier(@ModelAttribute MstSupplier mstSupplier) {
        ModelAndView mv = new ModelAndView("mstSupplier");
        List<MstSupplier> suppliers = mstSupplierService.getAllSupplier();
        mv.addObject("allSupplier", suppliers);
        mv.addObject("supp", new  MstSupplier());

        //location data
        List<MstProvince> provinces = locationService.findAllProvince();
        Map<Long, String> province = new HashMap<>();
        for (MstProvince curProvince : provinces){
            province.put(curProvince.getId(), curProvince.getName());
        }

        List<MstRegion> regions = locationService.findAllRegion();
        Map<Long, String> region = new HashMap<>();
        for (MstRegion curRegion : regions){
            region.put(curRegion.getId(), curRegion.getName());
        }

        List<MstDistrict> districts = locationService.findAllDistrict();
        Map<Long, String> district = new HashMap<>();
        for (MstDistrict curDistrict : districts){
            district.put(curDistrict.getId(), curDistrict.getName());
        }

        mv.addObject("province", province);
        mv.addObject("region", region);
        mv.addObject("district",district);
        return mv;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView search(@RequestParam String searchField){
        ModelAndView mv = new ModelAndView("mstSupplier");
        List<MstSupplier> list = mstSupplierService.getSearch(searchField);
        mv.addObject("searchField", list);
        return mv;
    }

    @RequestMapping(value="/edit_form/{id}" , method = RequestMethod.GET)
    public @ResponseBody
        MstSupplier getSupplier(@PathVariable Long id) {
        MstSupplier supplier = mstSupplierService.getSupplier(id);
        System.out.println(supplier.getId());
        return supplier;
    }

//    @RequestMapping(value = "/edit_form", method = RequestMethod.GET)
//    public ModelAndView editForm(@RequestParam long id){
//        ModelAndView mv = new ModelAndView("mstSupplier");
//        MstSupplier supplier = mstSupplierService.getSupplier(id);
//        mv.addObject("editSupplier", supplier);
//        return mv;
//    }

    @RequestMapping(value = "/save-update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("supp") MstSupplier supplier){
        ModelAndView mv = new ModelAndView("redirect:/Supplier/");
        mstSupplierService.update(supplier);
        return mv;
    }

    @RequestMapping(value = "/saveUpdate-supplier", method = RequestMethod.POST)
    public ModelAndView saveUpdate(@ModelAttribute("supp") MstSupplier supplier){
        ModelAndView mv = new ModelAndView("redirect:/Supplier/");
        mstSupplierService.saveUpdate(supplier);
        return mv;
    }
}
