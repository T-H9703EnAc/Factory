package com.app.calculation;

import java.math.BigDecimal;

public class AddCalculation extends AbstCalculation {

	@Override
	public void calculation(String[] args) {
		
		BigDecimal result = new BigDecimal(0);
		
		for(String str : args) {
			result = result.add(new BigDecimal(str));
		}
		
		System.out.println("***** 加算結果 *****");
		System.out.println(result);
		System.out.println("**********************");

	}

}
