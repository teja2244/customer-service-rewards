package com.practice.service.customerrewards.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.service.customerrewards.model.Customer;
import com.practice.service.customerrewards.model.MyTransaction;

@Service
public class RewardsServiceMock {

	private static List<MyTransaction> transactions = new ArrayList<MyTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new MyTransaction(index++, new Customer(1, "Ram"), 
				100.0, "Purchase 1", new Date()));
		transactions.add( new MyTransaction(index++, new Customer(2, "Shyam"), 
				50.0, "Purchase 2", new Date()));
		transactions.add( new MyTransaction(index++, new Customer(3, "Teju"), 
				120.0, "Purchase 3", new Date()));
		transactions.add( new MyTransaction(index++, 
				new Customer(5, "Kancherla"), 150.0, "Purchase 4", new Date()));
	}
	
	
	public List<MyTransaction> getAll() {
		return transactions;
	}
}
