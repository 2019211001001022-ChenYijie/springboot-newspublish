package com.ruanko.control;


import com.ruanko.entity.Problem;
import com.ruanko.service.FrequestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FrequestionControl {
    @Autowired
    FrequestionService frequestionService;
    @RequestMapping("/problemshow")
    public String problemshow(Model model){
        List<Problem> problem=frequestionService.getAll();
        model.addAttribute("problem",problem);
        return "customerService/problemshow";
    }
}
