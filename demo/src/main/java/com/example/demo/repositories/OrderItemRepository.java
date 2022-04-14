package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Orderitem;

@Transactional
@Repository
public interface OrderItemRepository extends JpaRepository<Orderitem, Integer>
{

}
