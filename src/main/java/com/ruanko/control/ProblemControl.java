package com.ruanko.control;


import com.ruanko.entity.Problem;
import com.ruanko.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class ProblemControl {
String createTime;
    @Autowired
    ProblemService problemService;
    @RequestMapping(value = "/toAddProblem",method = RequestMethod.GET)
    public String toAddProblem(Model model){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        createTime = dateFormat.format(date);
        model.addAttribute("createTime",createTime);
        return "customerService/addProblem";
    }

    @RequestMapping(value = "/ProblemAdd",method = RequestMethod.POST)
    public String ProblemAdd(Problem problem){
        problem.setCreateTime(createTime);
        problemService.add(problem);
        return "success";
    }
}
