package com.ruanko.service.impl;

import com.ruanko.dao.ProblemDao;
import com.ruanko.entity.Problem;
import com.ruanko.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    private ProblemDao problemDao;

    /**
     * 添加
     *
     * @param problem
     * 			常见问题
     */
    public void add(Problem problem) {
        problemDao.save(problem);
    }
}
