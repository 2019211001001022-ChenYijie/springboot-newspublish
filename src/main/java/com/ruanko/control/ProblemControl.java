package com.ruanko.control;


import com.ruanko.entity.Problem;
import com.ruanko.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.time.temporal.TemporalField;
import java.util.Date;


@Controller
public class ProblemControl {

    @Autowired
    ProblemService problemService;
    @RequestMapping(value = "/toAddProblem",method = RequestMethod.GET)
    public String toAddProblem(){
        return "customerService/addProblem";
    }

    @RequestMapping(value = "/ProblemAdd",method = RequestMethod.POST)
    public String ProblemAdd(Problem problem, Model model){
        problemService.add(problem);
//        String date= String.valueOf(problem.getCreatetime());
//        String date= String.valueOf(LocalDateTime.now().get((TemporalField) problem.getCreatetime()));
//        model.addAttribute("date",date);
        return "success";
    }
}
