package com.example.demo.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Retailer;

@Transactional
@Repository
public interface RetailerRepository extends JpaRepository<Retailer, Integer>
{

}