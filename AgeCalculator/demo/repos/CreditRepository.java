package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Credit;
import com.example.demo.models.Flight;

public interface CreditRepository extends JpaRepository<Credit, Long>  {

	
	@Query(value="SELECT count(cvv_number) FROM credit_card WHERE credit_card_number=?1 AND expiry_date=?2 AND cvv_number=?3", nativeQuery = true)
	public int validate(String credit_card_number, String expiry_date, String cvv_number);
}
