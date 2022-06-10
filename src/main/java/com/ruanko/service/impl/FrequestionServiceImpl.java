package com.ruanko.service.impl;

import com.ruanko.dao.DriverDao;
import com.ruanko.dao.FrequestionDao;
import com.ruanko.entity.Problem;
import com.ruanko.service.FindDriversService;
import com.ruanko.service.FrequestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FrequestionServiceImpl implements FrequestionService {
    @Autowired
    private FrequestionDao frequestionDao;
    public List<Problem> getAll(){
        return frequestionDao.findAll();
    }
}
