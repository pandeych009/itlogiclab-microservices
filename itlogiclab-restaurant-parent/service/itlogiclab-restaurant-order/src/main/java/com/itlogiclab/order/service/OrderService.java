package com.itlogiclab.order.service;

import java.util.List;

import com.itlogiclab.order.modal.OrderModal;

public interface OrderService {
	
	public List<OrderModal> get();

	public OrderModal get(Long id);
	
	public OrderModal add(OrderModal modal);
	
	public OrderModal update(final OrderModal modal);
	
	public boolean delete();
	
	public boolean delete(Long id);

}
