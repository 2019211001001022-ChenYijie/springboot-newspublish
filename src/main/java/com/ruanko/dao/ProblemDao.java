package com.ruanko.dao;


import com.ruanko.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemDao extends JpaRepository<Problem,Integer>{
}
