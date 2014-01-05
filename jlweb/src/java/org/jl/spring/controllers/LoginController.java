/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.spring.controllers;

import org.jl.dao.StudentDAOI;
import org.jl.vo.StudentTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rishitha
 */
@Controller
public class LoginController {
    
    @Autowired
    StudentDAOI stdao;
    @RequestMapping("/login.spring")
    public ModelAndView getStudent(StudentTo st ){
        System.out.println("IN controller ");
        ModelAndView mv = new ModelAndView("success");
        StudentTo stdb = stdao.getStudent(st);
        if(stdb !=null && stdb.getFname() != null ){
            mv.addObject("student",stdb);
            return mv;
        }
        
        return new ModelAndView("failure");
    }
    
    
}
