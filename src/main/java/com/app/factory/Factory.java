package com.app.factory;

import java.util.ArrayList;
import java.util.List;

import com.app.calculation.AbstCalculation;

public abstract class Factory {
	
	private List<AbstCalculation> products = new ArrayList<AbstCalculation>();
	
	protected void registProduct(AbstCalculation... products) {
		
		for(AbstCalculation product : products) {
			this.products.add(product);
		}
	}
	
	public abstract void execute(String[] args);

	protected List<AbstCalculation> getProducts() {
		return products;
	}	
}
