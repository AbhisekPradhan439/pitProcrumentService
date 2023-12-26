package com.pitProcrumentService.service.impl;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pitProcrumentService.entity.PurchaseOrder;
import com.pitProcrumentService.repository.PurchaseOrderRepository;
import com.pitProcrumentService.service.PurchaseOrderService;



@Service
public  class PurchaseOrderServiceImpl implements PurchaseOrderService {
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;

	@Override
	public PurchaseOrder getPurchaseOrderById(Integer id) {
		PurchaseOrder purchaseOrder = purchaseOrderRepository.getReferenceById(id);
		return purchaseOrder;
	}
	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrderRepository.findAll();
	}
	public Optional<PurchaseOrder> putPurchaseOrderById(Integer id) {
		return purchaseOrderRepository.findById(id);
	}

	@Override
	public PurchaseOrder UpdatePurchaseOrder(PurchaseOrder purchaseOrder) {
		return purchaseOrderRepository.save(purchaseOrder);
	}

	@Override
	public PurchaseOrder CreatePurchaseOrder(PurchaseOrder PurchaseOrder) {
		return purchaseOrderRepository.save(PurchaseOrder);
	}

	@Override
	public void deletePurchaserOrder(Integer id) {
		 purchaseOrderRepository.deleteById(id); 

	}
	
	@Override
	public List<PurchaseOrder> getPurchaseOrderByDate(LocalDate validfrom,
			LocalDate validto) {
		
		return purchaseOrderRepository.findPruchaseOrderByDate(validfrom, validto);
	}
	
}
