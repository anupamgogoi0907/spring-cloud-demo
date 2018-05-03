package com.anupam.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping(path = "/accounts")
	public List<Account> getAccounts() {
		List<Account> listAccount = new ArrayList<>();
		listAccount.add(new Account(1, 10, 1000));
		listAccount.add(new Account(2, 11, 1000));
		return listAccount;
	}

	public class Account {
		private int accountId;
		private int customerId;
		private double balance;

		public Account(int accountId, int customerId, double balance) {
			super();
			this.accountId = accountId;
			this.customerId = customerId;
			this.balance = balance;
		}

		public int getAccountId() {
			return accountId;
		}

		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

	}
}
