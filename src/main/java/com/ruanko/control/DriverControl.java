package com.ruanko.control;

import com.ruanko.entity.Driver;
import com.ruanko.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DriverControl {
    @Autowired
    DriverService driverService;
    @RequestMapping(value = "/toAddDriver",method = RequestMethod.GET)
    public String toAddNews(){
        return "driver/driver";
    }
    @RequestMapping(value = "/driverAdd",method = RequestMethod.POST)
    public String driverAdd(Driver driver){
        int len=driver.getPhone().length();
        if (len==11){
            driverService.add(driver);
            return "driverSuccess";
        }else {
            return "driverError";
        }
    }
}
