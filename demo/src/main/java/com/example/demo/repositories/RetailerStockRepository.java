package com.example.demo.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.RetailerStock;

@Transactional
@Repository
public interface RetailerStockRepository extends JpaRepository<RetailerStock, Integer>
{
	@Query("select r from RetailerStock r where retailerid = ?1")
	List<RetailerStock> getStockForRetailer(int rid);
}
