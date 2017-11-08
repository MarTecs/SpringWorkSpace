package com.itheima.demo1;

public class CustomerService {
	
	public CustomerDao customerDao1;
	public void setCustomerDao(CustomerDao customerDao2) {
		this.customerDao1 = customerDao2;
	}


	public void save() {
		System.out.println("service");
		customerDao1.save();
	}

}
