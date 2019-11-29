package com.astra.pos.controller;

import com.astra.pos.UserEmployeeOutletCmd;
import com.astra.pos.model.*;
import com.astra.pos.repository.*;
import com.astra.pos.service.MstUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class UserController {

    @Autowired
    MstUserRepository mstUserRepository;

    @Autowired
    MstRoleRepository mstRoleRepository;

    @Autowired
    MstEmployeeRepository mstEmployeeRepository;

    @Autowired
    MstOutletRepository mstOutletRepository;

    @Autowired
    AssEmployeeOutletRepository assEmployeeOutletRepository;



//    @Autowired
//    MstUserService mstUserService;

    @GetMapping("/employees")
    public ModelAndView getUsers()
    {
        ModelAndView mv = new ModelAndView();
        ModelMap modelMap = new ModelMap();

        UserEmployeeOutletCmd userEmployeeOutletCmd = new UserEmployeeOutletCmd();


        List<MstRole> mstRoles = mstRoleRepository.findAll();
        Map<Long, String> role = new HashMap<>();
        for (MstRole getRole : mstRoles){
            role.put(getRole.getId(), getRole.getName());
        }

        List<MstOutlet> mstOutlets = mstOutletRepository.findAll();
        Map<Long, String> outlet = new HashMap<>();
        for (MstOutlet getOutlet : mstOutlets){
            outlet.put(getOutlet.getId(), getOutlet.getName());
        }

//        System.out.println("OBJECT 1" + mstOutlets);
//        System.out.println("OBJECT 2" + outlet);

//        mv.addObject("outlets", mstOutletRepository.findAll());
        mv.addObject("outlets", outlet);
        mv.addObject("users", mstUserRepository.findAll());
        mv.addObject("roles", role);
        mv.addObject("employees", mstEmployeeRepository.findAll());

//        mv.addObject("userCommand", new MstUser());
//        mv.addObject("outletEmployeeCommand", new AssEmployeeOutlet());

        modelMap.addAttribute("userOutlets", userEmployeeOutletCmd);
        mv.addAllObjects(modelMap);

        mv.setViewName("employee");

        return mv;
    }


    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ModelAndView saveUsers(String firstName, String lastName, String email, String title, String username,
                                  String password, @ModelAttribute("userOutlets") UserEmployeeOutletCmd userEmployeeOutletCmd,
                                  @RequestParam(value = "checkbox", required = false) String checkboxValue)
    {


        MstEmployee mstEmployee = new MstEmployee();
        MstUser mstUser = new MstUser();
        AssEmployeeOutlet assEmployeeOutlet = new AssEmployeeOutlet();


        if (checkboxValue != null){
            mstEmployee.setFirstName(firstName);
            mstEmployee.setLastName(lastName);
            mstEmployee.setEmail(email);
            mstEmployee.setTitle(title);
            mstEmployee.setActive(true);
            mstEmployee.setHaveAccount(true);


            mstUser.setUsername(username);
            mstUser.setPassword(password);
            mstUser.setActive(true);
            mstUser.setEmployee(mstEmployee);
            mstUser.setRole_id(userEmployeeOutletCmd.getMstUser().getRole_id());

            assEmployeeOutlet.setEmployee(mstEmployee);
            assEmployeeOutlet.setOutlet_id(userEmployeeOutletCmd.getAssEmployeeOutlet().getOutlet_id());


            mstEmployeeRepository.save(mstEmployee);
            mstUserRepository.save(mstUser);
            assEmployeeOutletRepository.save(assEmployeeOutlet);
        }
        else{
            mstEmployee.setFirstName(firstName);
            mstEmployee.setLastName(lastName);
            mstEmployee.setEmail(email);
            mstEmployee.setTitle(title);
            mstEmployee.setActive(true);
            mstEmployee.setHaveAccount(false);

            assEmployeeOutlet.setEmployee(mstEmployee);
            assEmployeeOutlet.setOutlet_id(userEmployeeOutletCmd.getAssEmployeeOutlet().getOutlet_id());

            mstEmployeeRepository.save(mstEmployee);
            assEmployeeOutletRepository.save(assEmployeeOutlet);

        }

        return getUsers();

    }



}
