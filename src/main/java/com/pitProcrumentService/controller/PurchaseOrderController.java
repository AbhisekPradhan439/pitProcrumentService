package com.pitProcrumentService.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pitProcrumentService.entity.PurchaseOrder;
import com.pitProcrumentService.service.PurchaseOrderService;

@RestController
@RequestMapping("/api/PurchaseOrder")
public class PurchaseOrderController {
	
	    @Autowired
	    private PurchaseOrderService purchaseOrderService; 

	    @GetMapping("/api/PurchaseOrder")
	  // @ResponseStatus(value=HttpStatus.OK,reason="purchaseorder getall succesfully")
	    public List<PurchaseOrder> getPurchaseOrders() {    
	    	return  purchaseOrderService.getPurchaseOrders();
	    	 }  
	    
	     // @GetMapping("/api/PurchaseOrder?validFrom=2023-05-04&validTo=2023-06-04")
	  //  public ResponseEntity<List<PurchaseOrder>> getPurchaseOrders(
	          //  @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate validFrom,
	         //   @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate validTo) {

	      //  List<PurchaseOrder> purchaseOrders = purchaseOrderService.getPurchaseOrders();
//
	      //  return ResponseEntity.ok(purchaseOrders);
	  //  }
	      @GetMapping("/api/PurchaseOrderNotification")
	      public ResponseEntity<List<PurchaseOrder>> getPurchaseOrdersByDate()
	      {
	    	  LocalDate currentDate = LocalDate.now();
	    	  LocalDate dateAfter3Months = currentDate.plusMonths(3);
	    	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    	  
	          String fromDate = currentDate.format(formatter);
	          String toDate = dateAfter3Months.format(formatter);
	          LocalDate validfrom =null;
	          LocalDate validto =null;
	            try {
	              // Parse the string to LocalDate
	            	validfrom = LocalDate.parse(fromDate, formatter);
	               validto = LocalDate.parse(toDate, formatter);
       } catch (Exception e) {
	              // Handle parsing exception
	              System.out.println("Error parsing the date: " + e.getMessage());
	          }
	    	   
	          List<PurchaseOrder> purchaseOrders = purchaseOrderService.getPurchaseOrderByDate(validfrom,validto);
	          return ResponseEntity.ok(purchaseOrders);
	      }
	      
	      
	 @GetMapping("/api/PurchaseOrder/{id}")

	  // @ResponseStatus(value=HttpStatus.OK,reason="purchaseorderID get succesfully")
	    public Optional<PurchaseOrder> getPurchaseOrdderById(@PathVariable Integer id) {
	        return purchaseOrderService.putPurchaseOrderById(id);
	    }
	    

	    @PostMapping("/Purchaseorder/{id}") 
	   // @ResponseStatus(value=HttpStatus.OK,reason="purchaseorder create succesfully")
	    public PurchaseOrder CreatePurchaseOrder(@RequestBody PurchaseOrder purchaseorder) {
	    	return purchaseOrderService.CreatePurchaseOrder(purchaseorder);  
	    	}
	    
	    
	      @PutMapping("/api/PurchaseOrder/{id}")
	// @ResponseStatus(value = HttpStatus.OK,reason="purchaseorder succesfully")
	   public PurchaseOrder updatePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
	    	  return purchaseOrderService.UpdatePurchaseOrder(purchaseOrder);
	    	  
	    	  }

	     @DeleteMapping("/api/PurchaseOrder/{id}")
	    public ResponseEntity<JSONObject> deletePurchaseOrder(@PathVariable Integer id) {
	        purchaseOrderService.deletePurchaserOrder(id);
	        
	        JSONObject jsonObject = new JSONObject();
	        try {
				jsonObject.put("status", true);
				jsonObject.put("message", "Success");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        return ResponseEntity.ok(jsonObject);
	    
	    }

}


