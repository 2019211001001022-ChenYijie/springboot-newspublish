package com.ruanko.service;


import com.ruanko.entity.Driver;

import java.util.List;

public interface FindDriversService {
    List<Driver> findByrealnameLike(String realname);
}
