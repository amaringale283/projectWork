package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Order;

@Transactional
@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer>
{
	@Query("select o from Order o where customerid = ?1")
	public Order getOrderforCustomer(int cid);
	
	@Query("select o from Order o where retailerid = ?1")
	public Order getOrderforRetailer(int rid);
}
