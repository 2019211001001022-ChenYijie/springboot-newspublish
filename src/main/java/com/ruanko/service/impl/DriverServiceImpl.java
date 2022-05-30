package com.ruanko.service.impl;


import com.ruanko.dao.DriverDao;
import com.ruanko.service.DriverService;
import com.ruanko.entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverDao driverDao;

    /**
     * 添加
     *
     * @param driver
     * 			司机
     */
    public void add(Driver driver) {driverDao.save(driver);}
}
