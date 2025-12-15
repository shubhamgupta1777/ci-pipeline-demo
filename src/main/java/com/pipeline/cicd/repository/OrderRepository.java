package com.pipeline.cicd.repository;

import com.pipeline.cicd.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
