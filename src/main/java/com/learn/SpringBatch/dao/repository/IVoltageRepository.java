package com.learn.SpringBatch.dao.repository;

import com.learn.SpringBatch.dao.entity.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoltageRepository extends JpaRepository<Voltage, Long> {

}