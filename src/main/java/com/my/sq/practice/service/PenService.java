package com.my.sq.practice.service;

import com.my.sq.practice.entities.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenService extends JpaRepository<Pen, Long> {

}
