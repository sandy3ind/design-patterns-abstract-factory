package com.javagain;

import com.javagain.factories.AbstractFactory;
import com.javagain.products.IceCream;
import com.javagain.products.Pizza;

public class App {

	public static void main(String args[]) {
		// Build Ice Cream
		AbstractFactory factory = AbstractFactory.getFactory("IceCream");
		IceCream iceCream = factory.getIceCream("Chocolate");
		iceCream.make();
		
		// Build Pizza
		factory = AbstractFactory.getFactory("Pizza");
		Pizza pizza = factory.getPizza("PeppyPaneer");
		pizza.make();
	}
	
}
