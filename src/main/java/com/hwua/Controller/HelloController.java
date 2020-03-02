package com.hwua.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    //http://localhost:8080/mvc/hello
    @RequestMapping("/hello")
    public ModelAndView sayHello(){
        System.out.println("hello,springmvc");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","frank");
        mv.setViewName("success");
        return mv;
    }
}
