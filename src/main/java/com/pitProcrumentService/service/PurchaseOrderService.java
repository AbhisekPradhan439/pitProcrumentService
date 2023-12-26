package com.pitProcrumentService.service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.pitProcrumentService.entity.PurchaseOrder;

public interface PurchaseOrderService {
	
	List<PurchaseOrder> getPurchaseOrderByDate(LocalDate validFrom, LocalDate validTo);

	PurchaseOrder getPurchaseOrderById(Integer id);
	
	List<PurchaseOrder> getPurchaseOrders();

	Optional<PurchaseOrder> putPurchaseOrderById(Integer id);
	
	PurchaseOrder UpdatePurchaseOrder(PurchaseOrder PurchaseOrder);
	
	PurchaseOrder CreatePurchaseOrder(PurchaseOrder PurchaseOrder);
	
	void deletePurchaserOrder(Integer id);

}
