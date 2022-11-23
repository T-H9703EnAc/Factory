package com.app.factory;

import com.app.calculation.AbstCalculation;
import com.app.calculation.AddCalculation;
import com.app.calculation.DivideCalculation;
import com.app.calculation.MultiplyCalculation;
import com.app.calculation.SubtractCalculation;

public class CalculationFactory extends Factory {

	@Override
	public void execute(String[] args) {
		super.registProduct(
			new AddCalculation(),
			new SubtractCalculation(),
			new MultiplyCalculation(),
			new DivideCalculation()
		);
		
		for(AbstCalculation product : super.getProducts()) {
			product.calculation(args);
		}
		
	}

}
