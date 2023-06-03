package com.itlogiclab.billing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itlogiclab.billing.modal.BillModal;

@Service
public interface BillingService {

	public BillModal add(final BillModal modal);
	
	
	public BillModal update(final BillModal modal);
	
	
	public List<BillModal> get();
	
	public BillModal get(long id);
	
	public  void delete(Long id) ;
	
	public void delete();
	
}
