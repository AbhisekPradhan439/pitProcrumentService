package com.pitProcrumentService.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pitProcrumentService.entity.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
	
	@Query("SELECT po FROM PurchaseOrder po WHERE po.validfrom >= :validfrom AND po.validto <= :validto")
	
	 List<PurchaseOrder> findPruchaseOrderByDate(@Param("validfrom") LocalDate validfrom,
	            @Param("validto") LocalDate validto);
		
	}