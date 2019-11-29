package com.astra.pos.controller;

import com.astra.pos.model.MstDistrict;
import com.astra.pos.model.MstOutlet;
import com.astra.pos.model.MstProvince;
import com.astra.pos.model.MstRegion;
import com.astra.pos.service.LocationService;
import com.astra.pos.service.MstOutletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OutletController {

    @Autowired
    MstOutletService mstOutletService;

    @Autowired
    LocationService locationService;

    //view all
//    @RequestMapping("/outlets")
//    public ModelAndView getOutlets()
//    {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("outlets", mstOutletService.findAll());
//        mv.setViewName("outlet");
//        return mv;
//    }

    //delete
//    @RequestMapping(value="/deactivate/{id}", method = RequestMethod.GET)
//    public String deactivateCategory(@PathVariable long id){
//        MstOutlet mstOutlet = mstOutletService.findOne(id);
//        mstOutlet.setActive(false);
//        mstOutletService.update(mstOutlet);
//        return "redirect:/outlet";
//    }

    //update
//    @RequestMapping(value="/edit/{id}")
//    public ModelAndView editOutlet(@PathVariable long id) {
//        MstOutlet mstOutlet = mstOutletService.findOne(id);
//        return new ModelAndView("", "outlet", mstOutlet );
//    }

    @RequestMapping(value="/edit/{id}" , method = RequestMethod.GET)
    public @ResponseBody
        MstOutlet getOutlet(@PathVariable Long id) {
        MstOutlet outlet = mstOutletService.findOne(id);
        System.out.println(outlet.getId());
        return outlet;
    }

    @RequestMapping(value="/editSave",method = RequestMethod.POST)
    public String edit(@ModelAttribute("outlet") MstOutlet mstOutlet){
        mstOutletService.saveOrUpdate(mstOutlet);
        return "redirect:/viewoutlets";
    }

    //save
//    @RequestMapping(value="/save",method = RequestMethod.POST)
//    public S tring save(@ModelAttribute("outlet") MstOutlet mstOutlet){
//        mstOutletService.save(mstOutlet);
//        return "redirect:/viewoutlets";
//    }

    //indexing
    @RequestMapping(value = "/viewoutlets")
    public String indexLocation (@ModelAttribute MstOutlet mstOutlet, Model model){
        //outlet data
        List<MstOutlet> list = mstOutletService.findAll();
        model.addAttribute("outlets", list );
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

        model.addAttribute("outlet", new MstOutlet());
        model.addAttribute("province", province);
        model.addAttribute("region", region);
        model.addAttribute("district",district);
        return "outlet";


    }
}
