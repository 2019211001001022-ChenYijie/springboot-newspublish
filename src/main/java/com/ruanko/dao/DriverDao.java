package com.ruanko.dao;

import com.ruanko.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverDao extends JpaRepository<Driver,Integer> {
}
