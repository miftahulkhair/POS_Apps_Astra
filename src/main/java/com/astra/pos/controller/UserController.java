package com.astra.pos.controller;

import com.astra.pos.model.MstEmployee;
import com.astra.pos.model.MstRole;
import com.astra.pos.model.MstUser;
import com.astra.pos.repository.MstEmployeeRepository;
import com.astra.pos.repository.MstRoleRepository;
import com.astra.pos.repository.MstUserRepository;
import com.astra.pos.service.MstUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

//    @Autowired
//    MstUserService mstUserService;

    @GetMapping("/employees")
    public ModelAndView getUsers()
    {
        ModelAndView mv = new ModelAndView();

//
//        List<MstRole> mstRoles = mstRoleRepository.findAll();
//        Map<Long, String> roles = new HashMap<>();
//        for (MstRole curRole : mstRoles){
//            roles.put(curRole.getId(), curRole.getName());
//        }


//        mv.addObject("userCommand", new MstUser());

        mv.addObject("users", mstUserRepository.findAll());
        mv.addObject("roles", mstRoleRepository.findAll());
        mv.addObject("employees", mstEmployeeRepository.findAll());
        mv.setViewName("employee");

        return mv;
    }



    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ModelAndView saveUsers(String firstName, String lastName, String email, String title, String username, String password, @RequestParam("role") MstRole role)
    {
        ModelAndView mv = new ModelAndView();

        MstEmployee mstEmployee = new MstEmployee();
        mstEmployee.setFirstName(firstName);
        mstEmployee.setLastName(lastName);
        mstEmployee.setEmail(email);
        mstEmployee.setTitle(title);
        mstEmployee.setActive(true);


        MstUser mstUser = new MstUser();
        mstUser.setUsername(username);
        mstUser.setPassword(password);
        mstUser.setActive(true);
        mstUser.setEmployee(mstEmployee);
        mstUser.setRole(role);


        mstEmployeeRepository.save(mstEmployee);
        mstUserRepository.save(mstUser);


//        mv.setViewName("employee");

        return getUsers();
    }



}
