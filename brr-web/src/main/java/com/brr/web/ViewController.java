package com.brr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: hxp
 * @date: 2019/5/8 19:16
 * @description:
 */
@Controller
public class ViewController {

    @RequestMapping(value = "viewTest",method = RequestMethod.GET)
    public ModelAndView viewTest(){
        synchronized (ViewController.class){
            System.out.println("===================");
        }
        return new ModelAndView("/world");
    }
}
