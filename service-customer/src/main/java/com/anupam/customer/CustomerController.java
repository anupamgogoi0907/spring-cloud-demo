package com.anupam.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping(path = "/customers")
	public List<Customer> getCustomers() {
		List<Customer> listCustomer = new ArrayList<>();
		listCustomer.add(new Customer(1, "Anupam Gogoi"));
		listCustomer.add(new Customer(2, "Sheila Gogoi"));
		return listCustomer;
	}

	public class Customer {
		private int customerId;
		private String customerName;

		public Customer(int customerId, String customerName) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

	}
}
