package com.app.calculation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubtractCalculation extends AbstCalculation {

	@Override
	public void calculation(String[] args) {

		BigDecimal result = new BigDecimal(args[0]);
		
		List<String> list = new ArrayList<String>(Arrays.asList(args));
		list.remove(0);
		
		for(String str : list) {
			result = result.subtract(new BigDecimal(str));
		}
		
		System.out.println("***** 減算結果 *****");
		System.out.println(result);
		System.out.println("**********************");

	}

}
