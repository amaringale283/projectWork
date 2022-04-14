package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.CustomerStock;

@Transactional
@Repository
public interface CustomerStockRepository extends JpaRepository<CustomerStock, Integer>
{
	@Query("select c from CustomerStock c where customerid = ?1")
	List<CustomerStock> getStockForCustomer(int cid);
}
