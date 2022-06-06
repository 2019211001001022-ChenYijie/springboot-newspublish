package com.ruanko.control;

import com.ruanko.entity.Article;
import com.ruanko.entity.Driver;
import com.ruanko.service.DriverService;
import com.ruanko.service.FindDriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FindDriversControl {
    @Autowired
    FindDriversService findDriversService;
    @RequestMapping(value = "/todrivershow",method = RequestMethod.GET)
    public String toAddNews(){
        return "driver/drivershow";
    }
    @RequestMapping(value = "/drivershow",method = RequestMethod.POST)
    public String driverShow(Model model,String realname){
        List<Driver> driver= findDriversService.findByrealnameLike(realname);
        model.addAttribute("driver",driver);
        return "driver/drivershowDetail";
    }
}
