package com.app;

import com.app.factory.CalculationFactory;
import com.app.factory.Factory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new CalculationFactory();
		factory.execute(args);
	}

}
