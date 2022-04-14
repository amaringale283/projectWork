package com.example.demo.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Retailer;

@Transactional
@Repository
public interface RetailerRepository extends JpaRepository<Retailer, Integer>
{
	@Query("select r.rid from Retailer r where loginid = ?1")
	int getRetailer(int loginid);
}
