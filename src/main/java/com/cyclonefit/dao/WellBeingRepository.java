package com.cyclonefit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cyclonefit.model.CycloneWellBeing;

@Repository
@Transactional
public interface WellBeingRepository extends JpaRepository<CycloneWellBeing, String>{

}
