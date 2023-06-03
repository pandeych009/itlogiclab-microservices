package com.itlogiclab.order.api;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itlogiclab.order.modal.OrderModal;
import com.itlogiclab.order.service.OrderService;

@RestController
@RequestMapping("/order/api/")
public class OrderApi {

	private static Logger logger = LogManager.getLogger(OrderApi.class);

	@Autowired
	private OrderService orderService;

	@PutMapping(value="/add", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderModal> add(@RequestBody OrderModal modal){
		logger.error("Creating new Order: ");
		try {
			OrderModal persisted = orderService.add(modal);
			logger.error("Order created successfully with id: "+persisted.getOrderId());
			return ResponseEntity.ok(persisted);	
		} catch (RuntimeException e) {
			logger.error("Error occured while creating new order: "+e.getMessage());
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}

	@PostMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderModal> updateOrder(@RequestBody OrderModal order){
		logger.error("Update Order : "+order.getOrderId());
		try {
			OrderModal persisted = orderService.update(order);
			return ResponseEntity.ok(persisted);	
		} catch (RuntimeException e) {
			logger.error("Error occured while update the order: order id {} : ", order.getOrderId() +e.getMessage());
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}

	@GetMapping(value="/get", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OrderModal>> get(){
		logger.error("Fetching all orders: ");
		try {
			List<OrderModal> persisted =   orderService.get();
			return ResponseEntity.ok(persisted);	
		} catch (RuntimeException e) {
			logger.error("Error occured while fetching all orders from DB: "+e.getMessage());
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();

		}
	}

	@GetMapping(value="/get/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderModal> getOrder(@PathVariable Long id){
		logger.error("Fetching order by id: "+id);
		try {
			OrderModal persisted =   orderService.get(id);
			return ResponseEntity.ok(persisted);	
		} catch (RuntimeException e) {
			logger.error("Error occured while fetching order with id {} from DB: ",id +e.getMessage());
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		orderService.delete(id);
		return ResponseEntity.status(200).body("Order with id "+id+": Delete");
	}
	
	@DeleteMapping(value = "delete")
	public ResponseEntity<String> delete(){
		orderService.delete();
		return ResponseEntity.status(200).body("All Orders are deleted");
	}
}
