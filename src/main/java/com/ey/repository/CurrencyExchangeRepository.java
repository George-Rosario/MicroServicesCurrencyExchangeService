package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.model.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from,String to);

}
