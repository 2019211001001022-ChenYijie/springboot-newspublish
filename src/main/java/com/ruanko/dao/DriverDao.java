package com.ruanko.dao;

import com.ruanko.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverDao extends JpaRepository<Driver,Integer> {
    List<Driver> findByRealnameLike(String realname);
}
