package com.ruanko.control;


import com.ruanko.entity.Problem;
import com.ruanko.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProblemControl {

    @Autowired
    ProblemService problemService;
    @RequestMapping(value = "/toAddProblem",method = RequestMethod.GET)
    public String toAddProblem(){
        return "customerService/addProblem";
    }

    @RequestMapping(value = "/ProblemAdd",method = RequestMethod.POST)
    public String ProblemAdd(Problem problem){
        problemService.add(problem);
        return "success";
    }
}
