package com.example.internship.liveasy.dao;

import com.example.internship.liveasy.entities.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoadDao extends JpaRepository<Load,Long> {

    List<Load> findByShipperIdEquals(@Param("shipperId") Long shipperId);
}
