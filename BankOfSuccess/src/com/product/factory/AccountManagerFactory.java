package com.product.factory;

import com.product.model.AccountManager;

public class AccountManagerFactory {
	public AccountManager create() {
		return new AccountManager();
	}
}
