package com.example.demo.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AdminStock;

@Transactional
@Repository
public interface AdminStockRepository extends JpaRepository<AdminStock, Integer>{
	@Query("select c from AdminStock c where loginid = ?1")
	public List<AdminStock> getStockForAdmin(int loginid);
}
