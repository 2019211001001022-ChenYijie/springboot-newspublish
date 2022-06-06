package com.ruanko.service.impl;

import com.ruanko.dao.DriverDao;

import com.ruanko.entity.Article;
import com.ruanko.entity.Driver;
import com.ruanko.service.FindDriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindDriversServiceImpl implements FindDriversService {
    @Autowired
    private DriverDao driverDao;

    /**
     * 得到司机信息
     *
     * @param realname
     * 			司机姓名
     *
     * @return 司机信息
     */
    public List<Driver> findByrealnameLike(String realname){
        return driverDao.findByRealnameLike(realname);
    }
}
