package com.Stocks.Simple_Portfolio_Tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Stocks.Simple_Portfolio_Tracker.Model.Stock;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Long> {
	List<Stock> findByUserId(Long userId);

	void deleteByUserId(Long userId);
}