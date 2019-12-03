package com.astra.pos.controller;

import com.astra.pos.UserEmployeeOutletCmd;
import com.astra.pos.model.*;
import com.astra.pos.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class EmployeeController {

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



    @GetMapping("/employees")
    public ModelAndView getEmployees()
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


        mv.addObject("outlets", outlet);
        mv.addObject("users", mstUserRepository.findAll());
        mv.addObject("roles", role);
        mv.addObject("employees", mstEmployeeRepository.findAllActiveEmployee());


        modelMap.addAttribute("userOutlets", userEmployeeOutletCmd);
        mv.addAllObjects(modelMap);

        mv.setViewName("employee");

        return mv;
    }


    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ModelAndView saveEmployee(String firstName, String lastName, String email, String title, String username,
                                     String password, @ModelAttribute("userOutlets") UserEmployeeOutletCmd userEmployeeOutletCmd,
                                     @RequestParam(value = "checkbox", required = false) String checkboxValue, Long id, MstEmployee employee,
                                     @RequestParam(value = "checkbox2", required = false) String checkboxValue2,
                                     @RequestParam(value = "user_id", required = false) Long user_id,
                                     @RequestParam(value = "assEmployeeOutlet_id", required = false) Long assEmployeeOutlet_id)
    {

        MstEmployee mstEmployee = new MstEmployee();
        MstUser mstUser = new MstUser();
        AssEmployeeOutlet assEmployeeOutlet = new AssEmployeeOutlet();

        if(id != null){
            if(checkboxValue2 == null) {
                if(user_id != null){
                    employee.setHaveAccount(true);
                }
                employee.setActive(true);

                assEmployeeOutlet.setId(assEmployeeOutlet_id);
                assEmployeeOutlet.setEmployee(employee);
                assEmployeeOutlet.setOutlet_id(userEmployeeOutletCmd.getAssEmployeeOutlet().getOutlet_id());

                mstEmployeeRepository.save(employee);
                assEmployeeOutletRepository.save(assEmployeeOutlet);

            }else {

                employee.setHaveAccount(true);
                employee.setActive(true);

                mstUser.setId(user_id);
                mstUser.setUsername(username);
                mstUser.setPassword(password);
                mstUser.setActive(true);
                mstUser.setEmployee(employee);
                mstUser.setRole_id(userEmployeeOutletCmd.getMstUser().getRole_id());

                assEmployeeOutlet.setId(assEmployeeOutlet_id);
                assEmployeeOutlet.setEmployee(employee);
                assEmployeeOutlet.setOutlet_id(userEmployeeOutletCmd.getAssEmployeeOutlet().getOutlet_id());

                mstEmployeeRepository.save(employee);
                mstUserRepository.save(mstUser);
                assEmployeeOutletRepository.save(assEmployeeOutlet);

            }

        }else {
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

                if (userEmployeeOutletCmd.getAssEmployeeOutlet().getOutlet_id() == 0) {
                    mstEmployee.setFirstName(firstName);
                    mstEmployee.setLastName(lastName);
                    mstEmployee.setEmail(email);
                    mstEmployee.setTitle(title);
                    mstEmployee.setActive(true);
                    mstEmployee.setHaveAccount(false);

                    mstEmployeeRepository.save(mstEmployee);
                }else {
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
            }
        }

        return getEmployees();

    }


    @RequestMapping("/employees/edit/{id}")
    public ModelAndView editEmployee(@PathVariable("id") Long id){
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

        Optional<MstEmployee> employee = mstEmployeeRepository.findById(id);
//        Optional<MstUser> user = mstUserRepository.findById(employee.get().getUser().getId());


//        mv.addObject("users", user);
        mv.addObject("employees", employee);
        mv.addObject("outlets", outlet);
        mv.addObject("roles", role);


        modelMap.addAttribute("userOutlets", userEmployeeOutletCmd);
        mv.addAllObjects(modelMap);

        mv.setViewName("employeeEdit");

        return mv;
    }



    @RequestMapping("/employees/{id}")
    public ModelAndView deleteEmployee(@PathVariable Long id)
    {
        MstEmployee employee = mstEmployeeRepository.getOne(id);
        employee.setActive(false);
        mstEmployeeRepository.save(employee);

        return getEmployees();
    }

}
